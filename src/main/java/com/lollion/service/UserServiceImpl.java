package com.lollion.service;

import com.lollion.domain.User;
import com.lollion.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers(int count) {
        return userRepo.findAll(PageRequest.of(0, count)).getContent();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(long id) {
        return userRepo.getOne(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User createUser(String name, String status) {
        return userRepo.save(new User(name, status));
    }
}
