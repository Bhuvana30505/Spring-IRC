package com.example.Mapping01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mapping01.model.Question;

public interface QuestionRepo extends  JpaRepository<Question, Integer>{

}
