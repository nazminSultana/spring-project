package com.mindTrap.demo.service;

import com.mindTrap.demo.entity.User;
import com.mindTrap.demo.repository.UserReposetory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public final UserReposetory userReposetory;

    public UserService(UserReposetory userReposetory) {
        this.userReposetory = userReposetory;
    }

    public void addUser(User user) {
        userReposetory.save(user);
    }

    public List<User> getUser() {
        return userReposetory.findAll();
    }

    public void updateUser(int id, User user) {
        User u = userReposetory.findById(id).get();
        u.setName(user.getName());
        u.setPassword(user.getPassword());
        userReposetory.save(u);
    }

    public void deleteUser(int id) {
        userReposetory.deleteById(id);
    }
}
