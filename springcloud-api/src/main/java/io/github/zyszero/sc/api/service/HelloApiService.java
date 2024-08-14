package io.github.zyszero.sc.api.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Hello Service
 *
 * @Author: zyszero
 * @Date: 2024/8/14 23:10
 */
public interface HelloApiService {

    @GetMapping("/api/hello/hi")
    String hi();

    @GetMapping("/api/hello/a")
    String a(@RequestParam("name") String name);

    @GetMapping("/api/hello/b")
    String b(@RequestParam("name") String name);

    @GetMapping("/api/hello/c")
    String c(@RequestParam("name") String name);
}
