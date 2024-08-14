package io.github.zyszero.sc.contract;

import io.github.zyszero.sc.api.service.HelloApiService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * hello client
 *
 * @Author: zyszero
 * @Date: 2024/8/12 20:24
 */
@FeignClient(value = "helloService", contextId = "hello")
public interface HelloApiServiceClient extends HelloApiService {

}
