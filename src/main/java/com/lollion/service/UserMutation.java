package com.lollion.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.lollion.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMutation  implements GraphQLMutationResolver {

    private final UserService userService;

    public User createUser(final String name, final String status) {
        return userService.createUser(name, status);
    }

}
