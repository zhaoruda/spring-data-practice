package com.springdata.practice.service;

import com.springdata.practice.entity.User;
import com.springdata.practice.repository.crudRepository.UserCrudRepository;
import com.springdata.practice.repository.pagingAndSortingRepository.UserPagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserCrudRepository userCrudRepository;
    private final UserPagingAndSortingRepository userPagingAndSortingRepository;

    public UserService(UserCrudRepository userCrudRepository, UserPagingAndSortingRepository userPagingAndSortingRepository) {
        this.userCrudRepository = userCrudRepository;
        this.userPagingAndSortingRepository = userPagingAndSortingRepository;
    }

    public User create(User user) {
        return userCrudRepository.save(user);
    }

    public Page<User> getAllUserByPage(Pageable pageable) {
        return  userPagingAndSortingRepository.findAll(pageable);
    }
}
