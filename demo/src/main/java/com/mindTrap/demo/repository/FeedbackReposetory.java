package com.mindTrap.demo.repository;

import com.mindTrap.demo.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackReposetory extends JpaRepository<Feedback,Integer> {
}
