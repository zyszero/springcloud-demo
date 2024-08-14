package io.github.zyszero.sc.provider.controller;

import io.github.zyszero.sc.api.model.User;
import io.github.zyszero.sc.api.service.UserApiService;
import io.github.zyszero.sc.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User Controller
 *
 * @Author: zyszero
 * @Date: 2024/8/14 23:17
 */
@RestController
public class UserController implements UserApiService {

    @Value("${server.port}")
    private int port;

    @Autowired
    private UserService userService;

    @Override
    public List<User> list(String name) {
        return userService.list(name + "-" + port);
    }

    @Override
    public User findById(long id) {
        User user = userService.findById(id);
        user.setName(user.getName() + "-" + port);
        return user;
    }
}
