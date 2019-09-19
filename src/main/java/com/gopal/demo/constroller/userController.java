package com.gopal.demo.constroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.demo.model.User;
import com.gopal.demo.repo.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class userController {
	
	 // standard constructors
    @Autowired
    private UserRepository userRepository;
 
    @GetMapping("/users")
    public List<User> getUsers() {
    	System.out.println("************************");
    	System.out.println((List<User>) userRepository.findAll());
        return (List<User>) userRepository.findAll();
    }
 
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
    	System.out.println(user.getEmail());
        userRepository.save(user);
    }

}
