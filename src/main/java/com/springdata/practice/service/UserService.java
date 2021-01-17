package com.springdata.practice.service;

import com.springdata.practice.entity.User;
import com.springdata.practice.repository.crudRepository.UserCrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserCrudRepository userCrudRepository;

    public UserService(UserCrudRepository userCrudRepository) {
        this.userCrudRepository = userCrudRepository;
    }

    public User create(User user) {
        return userCrudRepository.save(user);
    }
}
