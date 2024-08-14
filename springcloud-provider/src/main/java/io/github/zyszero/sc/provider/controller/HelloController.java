package io.github.zyszero.sc.provider.controller;

import io.github.zyszero.sc.api.service.HelloApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello controller
 *
 * @Author: zyszero
 * @Date: 2024/8/12 19:50
 */
@RestController
public class HelloController implements HelloApiService {

    @Value("${server.port}")
    private int port;


    public String hi() {
        return "hello spring cloud from " + port;
    }

    public String a(@RequestParam("name") String name) {
        return "hello a, " + name + " form " + port;
    }

    public String b(@RequestParam("name") String name) {
        return "hello b, " + name + " form " + port;
    }


    @GetMapping("/api/hello/c")
    public String c(@RequestParam("name") String name) {
        return "hello c, " + name + " form " + port;
    }
}
