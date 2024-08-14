package io.github.zyszero.sc.provider.mapper.impl;

import io.github.zyszero.sc.api.model.User;
import io.github.zyszero.sc.provider.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User mapper impl.
 *
 * @Author: zyszero
 * @Date: 2024/8/14 23:43
 */
@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public List<User> list(String name) {
        return List.of(new User(1, name + "01", 28),
                new User(2, name + "02", 18));
    }

    @Override
    public User findById(long id) {
        return new User(id, "zyszero" + id, 26);
    }
}
