package com.quiz.QuizService.service;

import com.quiz.QuizService.entities.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> get();

    Quiz getOne(Long id);

}