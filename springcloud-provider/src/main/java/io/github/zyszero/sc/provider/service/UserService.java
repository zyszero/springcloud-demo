package io.github.zyszero.sc.provider.service;

import io.github.zyszero.sc.api.model.User;

import java.util.List;

/**
 * User service.
 *
 * @Author: zyszero
 * @Date: 2024/8/14 23:20
 */
public interface UserService {
    List<User> list(String name);

    User findById(long id);
}
