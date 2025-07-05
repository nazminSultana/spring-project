package com.mindTrap.demo.controller;

import com.mindTrap.demo.entity.User;
import com.mindTrap.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/add")
    public void addUser(
            @RequestBody User user
    ){
        userService.addUser(user);
    }
    @GetMapping("/user/get")
    public List<User> getUser(){
        return userService.getUser();
    }
    @PutMapping("/user/update/{id}")
    public void updateUser(
            @PathVariable int id,
            @RequestBody User user
    ){
        userService.updateUser(id,user);
    }
    @DeleteMapping("/user/delete/{id}")
    public void deleteUser(
            @PathVariable int id
    ){
        userService.deleteUser(id);
    }
}
