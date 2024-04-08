package com.Question.QuestionService.repositories;

import com.Question.QuestionService.entities.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question,Long> {

    List<Question> findByquizId(Long id);
}
