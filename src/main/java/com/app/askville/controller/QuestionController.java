package com.app.askville.controller;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.askville.model.QuestionModel;
import com.app.askville.repository.QuestionRepository;

@RestController
@RequestMapping("/api/v1")
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@PostMapping("/questions")
	public QuestionModel createQuestion(@Valid @RequestBody QuestionModel question) {
		return questionRepository.save(question);
	}
	
	//Fetch specific question by id
	@GetMapping("/questions/{id}")
	public Optional<QuestionModel> getQuestionById(@PathVariable Long id) {
		return questionRepository.findById(id);
	}

}
