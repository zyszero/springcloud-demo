package io.github.zyszero.sc.request;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * request interceptor
 *
 * @Author: zyszero
 * @Date: 2024/8/20 22:18
 */
public class PhoenixRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("X-Phoenix-Type", "ZZCloud");
        requestTemplate.header("X-Phoenix-Version", "0.0.1");
        requestTemplate.header("X-Phoenix-Client", "OpenFeign");
    }
}
