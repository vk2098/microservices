package com.quiz.QuizService.service;

import com.quiz.QuizService.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082",name = "Question-Client")
public interface QuestionClient {


    @GetMapping("/question/quiz/{id}")
   public List<Question> findQuestionsByQuizId(@PathVariable Long id);
}
