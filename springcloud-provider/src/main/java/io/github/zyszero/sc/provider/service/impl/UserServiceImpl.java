package io.github.zyszero.sc.provider.service.impl;

import io.github.zyszero.sc.api.model.User;
import io.github.zyszero.sc.provider.mapper.UserMapper;
import io.github.zyszero.sc.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User service impl.
 *
 * @Author: zyszero
 * @Date: 2024/8/14 23:39
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list(String name) {
        return userMapper.list(name);
    }

    @Override
    public User findById(long id) {
        return userMapper.findById(id);
    }
}
