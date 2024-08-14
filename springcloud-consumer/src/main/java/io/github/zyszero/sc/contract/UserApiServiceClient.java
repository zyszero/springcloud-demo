package io.github.zyszero.sc.contract;

import io.github.zyszero.sc.api.service.UserApiService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * user client
 *
 * @Author: zyszero
 * @Date: 2024/8/12 20:24
 */
@FeignClient(name = "helloService", contextId = "user")
public interface UserApiServiceClient extends UserApiService {

}
