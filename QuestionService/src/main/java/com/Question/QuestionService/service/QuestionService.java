package com.Question.QuestionService.service;

import com.Question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {
    Question add(Question question);
    List<Question> get();
    Question getOne(Long id);

    List<Question> getByQuizId(Long quizId);
}
