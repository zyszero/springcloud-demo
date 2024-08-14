package io.github.zyszero.sc.provider.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * service register aspect.
 *
 * @Author: zyszero
 * @Date: 2024/8/15 0:47
 */
@Aspect
@Component
public class ServiceRegisterAspect {
    //    public final static String TYPE = "type";
    public final static String DC = "dc";
    public final static String ZONE = "zone";
    public final static String ENV = "env";
    public final static String GROUP = "group";

    @Autowired
    Environment environment;

    @Before("execution(* org.springframework.cloud.client.serviceregistry.ServiceRegistry.register(..))")
    public void beforeRegister(JoinPoint joinPoint) {
        String dc = environment.getProperty(DC, "GZ");
        String zone = environment.getProperty(ZONE, "B001");
        String env = environment.getProperty(ENV, "DEV");
        String group = environment.getProperty(GROUP, "DEFAULT");

        System.out.println("ServiceRegisterAspect.beforeRegister for dc/zone/env/group: "
                + dc + "/" + zone + "/" + env + "/" + group);

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof Registration registration) {
                registration.getMetadata().put(DC, dc);
                registration.getMetadata().put(ZONE, zone);
                registration.getMetadata().put(ENV, env);
                registration.getMetadata().put(GROUP, group);
                System.out.println(registration.getMetadata());
            }
        }
    }
}
