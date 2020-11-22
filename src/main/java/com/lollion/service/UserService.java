package com.lollion.service;

import com.lollion.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers(int count);

    User getUser(long id);

    User createUser(String name, String status);
}
