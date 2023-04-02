package defi.example.defi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import defi.example.defi.model.Question;
import defi.example.defi.repo.QuestionRepo;

@Service
public class QuestionService {
	
	
 @Autowired
 private QuestionRepo repo;
 public Question saveQuestion (Question quest) {
	 return repo.save(quest);
 }
 
	
	
	
	
	
	
	
	
	

}
