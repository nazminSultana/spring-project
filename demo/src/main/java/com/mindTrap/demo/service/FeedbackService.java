package com.mindTrap.demo.service;

import com.mindTrap.demo.entity.Feedback;
import com.mindTrap.demo.repository.FeedbackReposetory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    public final FeedbackReposetory feedbackReposetory;

    public FeedbackService(FeedbackReposetory feedbackReposetory) {
        this.feedbackReposetory = feedbackReposetory;
    }
    public void addFeedback(Feedback feedback) {
        feedbackReposetory.save(feedback);
    }

    public List<Feedback> getFeedback() {
        return feedbackReposetory.findAll();
    }

    public void updateFeedback(int id, Feedback feedback) {
        Feedback f = feedbackReposetory.findById(id).get();
        f.setMessage(feedback.getMessage());
        feedbackReposetory.save(f);
    }

    public void deleteFeedback(int id) {
        feedbackReposetory.deleteById(id);
    }
}
