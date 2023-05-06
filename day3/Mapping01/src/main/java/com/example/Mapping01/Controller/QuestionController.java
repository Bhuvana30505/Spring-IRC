package com.example.Mapping01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mapping01.Repository.QuestionRepo;
import com.example.Mapping01.model.Question;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/question")

public class QuestionController {
	@Autowired
	QuestionRepo qrepo;
	@Tag(name="question")
	@PostMapping("")
	public String javaDetails(@RequestBody Question q) 
	{
    qrepo.save(q);
	return"Data is saved";
}
	@Tag(name="answer")
 @GetMapping("")
 public List<Question>shownQuAns()
{
	return qrepo.findAll();
 }
}
