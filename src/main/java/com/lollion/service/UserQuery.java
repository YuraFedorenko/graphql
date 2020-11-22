package com.lollion.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lollion.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserQuery implements GraphQLQueryResolver {

    private final UserService userService;

    public List<User> getUsers(final int count) {
        return userService.getAllUsers(count);
    }

    public User getUser(final long id) {
        return userService.getUser(id);
    }
}
