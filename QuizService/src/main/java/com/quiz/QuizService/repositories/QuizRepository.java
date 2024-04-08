package com.quiz.QuizService.repositories;

import com.quiz.QuizService.entities.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends CrudRepository<Quiz,Long> {
}
