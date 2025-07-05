package com.mindTrap.demo.repository;

import com.mindTrap.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposetory extends JpaRepository<User,Integer> {
}
