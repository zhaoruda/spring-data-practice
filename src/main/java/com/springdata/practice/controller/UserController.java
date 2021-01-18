package com.springdata.practice.controller;

import com.springdata.practice.entity.User;
import com.springdata.practice.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping("/page")
    public Page<User> getAllUserByPage(@PageableDefault(size = 10, page = 0) Pageable pageable) {
        return userService.getAllUserByPage(pageable);
    }
}
