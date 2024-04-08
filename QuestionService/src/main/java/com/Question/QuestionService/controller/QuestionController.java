package com.Question.QuestionService.controller;

import com.Question.QuestionService.entities.Question;
import com.Question.QuestionService.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    QuestionService questionService;
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question add(@RequestBody Question question){
        return questionService.add(question);
    }

    @GetMapping
    public List<Question> get(){
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id){
        return questionService.getOne(id);
    }

    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionsofQuiz(@PathVariable Long id){
        return questionService.getByQuizId(id);
    }
}
