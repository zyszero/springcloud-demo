package io.github.zyszero.sc.common.service;

import io.github.zyszero.sc.common.BaseRequest;
import io.github.zyszero.sc.common.BaseResponse;

/**
 * @Author: zyszero
 * @Date: 2024/8/20 21:00
 */
public interface BaseService<T> {
    BaseResponse<T> service(BaseRequest<T> request);
}
