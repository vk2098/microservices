package com.quiz.QuizService.service;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class QuizServiceImpl implements QuizService{
    QuizRepository quizRepository;

    QuestionClient questionClient;

    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {

        List<Quiz> quizzes= (List<Quiz>) quizRepository.findAll();
        return quizzes.stream().map(quiz -> {
            quiz.setQuestionList(questionClient.findQuestionsByQuizId(quiz.getId()));
            return quiz;

        }).collect(Collectors.toList());

    }

    @Override
    public Quiz getOne(Long id) {
        Quiz quiz= quizRepository.findById(id).orElseThrow(()-> new RuntimeException("No Quiz Found"));
        quiz.setQuestionList(questionClient.findQuestionsByQuizId(quiz.getId()));
        return  quiz;
    }
}
