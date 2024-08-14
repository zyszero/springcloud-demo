package io.github.zyszero.sc.provider.mapper;

import io.github.zyszero.sc.api.model.User;

import java.util.List;

/**
 * User mapper.
 * @Author: zyszero
 * @Date: 2024/8/14 23:40
 */
public interface UserMapper {
    List<User> list(String name);
    User findById(long id);
}
