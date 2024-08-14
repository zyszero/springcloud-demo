package io.github.zyszero.sc.consumer;

import io.github.zyszero.sc.api.model.User;
import io.github.zyszero.sc.contract.HelloApiServiceClient;
import io.github.zyszero.sc.contract.UserApiServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {
        "io.github.zyszero.sc"
})
public class SpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerApplication.class, args);
    }

    @Autowired
    HelloApiServiceClient helloServiceClient;

    @Autowired
    UserApiServiceClient userServiceClient;

    @Autowired
    ApplicationContext context;

    @Bean
    ApplicationRunner runner() {
        return args -> {
            System.out.println("helloService-consumer started");

            context.getBeansWithAnnotation(FeignClient.class).forEach((k, v) -> {
                System.out.println(" FeignClient ==> " + k + " : " + v);
            });
            System.out.println(Arrays.toString(context.getBeanNamesForType(HelloApiServiceClient.class)));
            System.out.println(Arrays.toString(context.getBeanNamesForType(UserApiServiceClient.class)));
            Arrays.stream(context.getBeanDefinitionNames())
                    .filter(x -> x.contains("hello") || x.contains("user")).forEach(System.out::println);
            System.out.println(context.getBean("user.FeignClientSpecification"));
            System.out.println(context.getBean("userFeignClient"));

            test();
        };
    }

    private void test() {
        String hello = helloServiceClient.hi();
        System.out.println(" ==> helloService.hi : " + hello);

        hello = helloServiceClient.a("zyszero");
        System.out.println(" ==> helloService.a : " + hello);

        hello = helloServiceClient.b("zzz");
        System.out.println(" ==> helloService.b : " + hello);

        User user123 = userServiceClient.findById(123);
        System.out.println(" ==> helloService.findById : " + user123);
    }
}
