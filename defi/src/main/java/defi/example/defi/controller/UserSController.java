package defi.example.defi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import defi.example.defi.model.User;
import defi.example.defi.service.UserSService;

@RestController
public class UserSController {
	
	
	
	@Autowired
	private UserSService service;
	
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4200")
	public User RegisterUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmailId();
		if(tempEmailId!=null&&!"".equals(tempEmailId)) {	
			User userobj=service.fetchUserByEmailId(tempEmailId);
			if(userobj!=null) {
				throw new Exception("User with "+tempEmailId+"is already exists");
			}
		}
		User userObj=null;
		userObj= service.saveUser(user);
		return userObj;
	}
	
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		
		String tempEmailId =user.getEmailId();
		String tempassword=user.getPassword();
		User userObj=null;
		if(tempEmailId != null && tempassword !=null) {
			userObj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempassword);
		}
		if(userObj==null) {
			throw new Exception("User not found");
		}
		return userObj;
	}	
}

