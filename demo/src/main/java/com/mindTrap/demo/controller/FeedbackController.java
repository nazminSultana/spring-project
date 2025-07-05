package com.mindTrap.demo.controller;

import com.mindTrap.demo.entity.Admin;
import com.mindTrap.demo.entity.Feedback;
import com.mindTrap.demo.repository.FeedbackReposetory;
import com.mindTrap.demo.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeedbackController {
    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }


    @PostMapping("/feedback/add")
    public void addFeedback(
            @RequestBody Feedback feedback
            ){
        feedbackService.addFeedback(feedback);
    }

    @GetMapping("/feedback/get")
    public List<Feedback> getFeedback(){
        return feedbackService.getFeedback();
    }
    @PutMapping("/feedback/update/{id}")
    public void updateAdmin(
            @PathVariable int id,
            @RequestBody Feedback feedback
    ){
        feedbackService.updateFeedback(id,feedback);
    }

    @DeleteMapping("/feedback/delete/{id}")
    public void deleteAdmin(
            @PathVariable int id
    ){
        feedbackService.deleteFeedback(id);
    }
}

