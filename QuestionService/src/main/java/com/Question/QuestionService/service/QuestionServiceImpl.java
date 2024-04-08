package com.Question.QuestionService.service;

import com.Question.QuestionService.entities.Question;
import com.Question.QuestionService.repositories.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements  QuestionService{
    QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public Question add(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return (List<Question>) questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepository.findById(id).orElseThrow(()->new RuntimeException("No question Found"));
    }

    @Override
    public List<Question> getByQuizId(Long quizId) {
        return questionRepository.findByquizId(quizId);
    }
}
