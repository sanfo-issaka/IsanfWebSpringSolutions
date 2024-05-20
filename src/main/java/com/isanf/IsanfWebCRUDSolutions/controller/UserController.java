package com.isanf.IsanfWebCRUDSolutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.User;
import com.isanf.IsanfWebCRUDSolutions.service.UserService;
import com.isanf.IsanfWebCRUDSolutions.service.dto.ResponseStructure;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	//save
	@PostMapping("/user")
	public ResponseStructure<User> saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	//get
	@GetMapping("/user/{id}")
	public ResponseStructure<User> getUserById(@PathVariable int id){
		return userService.getUserById(id);
	}
	
	//get all
	@GetMapping("/user")
	public ResponseStructure<List<User>> getAllUsers(){
		return userService.getAllUsers();
	}
	
	//update
	@PutMapping("/user/{id}")
	public ResponseStructure<User> updateUser(@RequestBody User user, @PathVariable int id){
		return userService.updateUser(user, id);
	}
	
	//delete
	@DeleteMapping("/user/{id}")
	public ResponseStructure<String> deleteUser(@PathVariable int id){
		return userService.deleteUser(id);
	}
	
}
