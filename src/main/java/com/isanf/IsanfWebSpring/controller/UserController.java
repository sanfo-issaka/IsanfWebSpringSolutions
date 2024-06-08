package com.isanf.IsanfWebSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isanf.IsanfWebSpring.domain.entity.UserOld;
import com.isanf.IsanfWebSpring.service.MonService;
import com.isanf.IsanfWebSpring.service.UserService;
import com.isanf.IsanfWebSpring.service.dto.ResponseStructure;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	MonService monService;
	
	//R 
	//get all
	@GetMapping("/userHQL")
	public ResponseStructure<List<UserOld>> getAllUsersHQL(){
		return userService.getAllUsersHQL();
	}
	
	//save
	@PostMapping("/user")
	public ResponseStructure<UserOld> saveUser(@RequestBody UserOld user, BindingResult result){
		//R 1
		//new UserValidator().validate(user, result);
		return userService.saveUser(user);
	}
	
	//R 16
	//get
	@GetMapping("/user/{id}")
	public ResponseStructure<UserOld> getUserById(@PathVariable int id){
		return userService.getUserById(id);
	}
	
	//get all
	@GetMapping("/user")
	public ResponseStructure<List<UserOld>> getAllUsers(){
		//R 8
//		MonService monService = new MonService();
//		monService.utiliserMesBeans();
		return userService.getAllUsers();
	}
	
	//update
	@PutMapping("/user/{id}")
	public ResponseStructure<UserOld> updateUser(@RequestBody UserOld user, @PathVariable int id){
		return userService.updateUser(user, id);
	}
	
	//delete
	@DeleteMapping("/user/{id}")
	public ResponseStructure<String> deleteUser(@PathVariable int id){
		return userService.deleteUser(id);
	}
	
	//R 15
	//get by name
	@GetMapping("/userByName/{name}")
	public ResponseStructure<UserOld> getUserById(@PathVariable String name){
		return userService.findAllByGivenName(name);
	}
	
}
