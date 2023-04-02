package defi.example.defi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import defi.example.defi.model.User;
import defi.example.defi.repo.UserSRepo;

@Service
public class UserSService {
	
	
	@Autowired
	private UserSRepo repo;
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
		 return repo.findByEmailId(email);
	}
	public User fetchUserByEmailIdAndPassword(String email,String password) {
		 return repo.findByEmailIdAndPassword(email,password);
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
