package defi.example.defi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import defi.example.defi.model.Question;
import defi.example.defi.service.QuestionService;

@RestController
public class QuestionController {
	
	
	@Autowired 
	private QuestionService service;
	
	@PostMapping("/registerquestion")
	@CrossOrigin(origins="http://localhost:4200")
	public Question RegisterQuestion(@RequestBody Question quest) {
		
		Question questobj=null;
		questobj=service.saveQuestion(quest);
		return questobj;
		
		
		
	}
	
	

}
