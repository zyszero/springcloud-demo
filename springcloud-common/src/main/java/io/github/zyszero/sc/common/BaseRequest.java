package io.github.zyszero.sc.common;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Base request.
 *
 * @Author: zyszero
 * @Date: 2024/8/15 0:21
 */
@Data
public class BaseRequest<T> {

    // 通用域
    private int appId; // 应用ID
    private int targetAppId; // 请求目标应用ID
    private int serviceId; // 服务ID

    private String traceId; // 链路跟踪ID
    private String spanId;


    // 业务域
    private long customerId; // 核心客户号

    // 扩展域
    private Map<String, Object> headers = new LinkedHashMap<>();
    private Map<String, Object> properties = new LinkedHashMap<>();

    // 私有域
    T data;
}
