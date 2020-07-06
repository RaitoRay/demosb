package com.ray.demo.service;

import com.ray.demo.entity.User;

public interface UserService {
    User loginIn(String name, String password);
}
