package io.github.zyszero.sc.api.service;

import io.github.zyszero.sc.api.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * User Service
 *
 * @Author: zyszero
 * @Date: 2024/8/14 23:10
 */
public interface UserApiService {
    @GetMapping("/api/user/list")
    List<User> list(@RequestParam("name") String name);

    @GetMapping("/api/user/find")
    User findById(@RequestParam("id") long id);
}
