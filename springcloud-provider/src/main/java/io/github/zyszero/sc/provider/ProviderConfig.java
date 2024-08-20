package io.github.zyszero.sc.provider;

import io.github.zyszero.sc.provider.handler.RequestHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: zyszero
 * @Date: 2024/8/20 22:45
 */
@Configuration
public class ProviderConfig {

    @Configuration
    @EnableWebMvc
    public static class WebConfig implements WebMvcConfigurer {

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new RequestHandlerInterceptor());
        }
    }
}
