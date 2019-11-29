package com.tuhv.login.service;

import com.tuhv.login.model.User;

public interface UserService {
    User findByUsername(String username);
}
