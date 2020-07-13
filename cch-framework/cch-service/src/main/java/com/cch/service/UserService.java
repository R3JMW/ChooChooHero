package com.cch.service;

import com.cch.model.User;

public interface UserService {

    int add(User user);

    User getUserByName(String name);
}
