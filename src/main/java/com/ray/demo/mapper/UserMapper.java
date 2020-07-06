package com.ray.demo.mapper;

import com.ray.demo.entity.User;

public interface UserMapper {
    User getInfo(String name, String password);
}
