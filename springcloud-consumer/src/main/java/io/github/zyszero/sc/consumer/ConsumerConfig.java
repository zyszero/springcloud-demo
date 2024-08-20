package io.github.zyszero.sc.consumer;

import io.github.zyszero.sc.request.PhoenixRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zyszero
 * @Date: 2024/8/20 22:22
 */
@Configuration
public class ConsumerConfig {
    @Bean
    public PhoenixRequestInterceptor requestInterceptor() {
        return new PhoenixRequestInterceptor();
    }
}
