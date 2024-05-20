package com.isanf.IsanfWebCRUDSolutions.repository.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.User;
import com.isanf.IsanfWebCRUDSolutions.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	UserRepository userRepository;
	
	//Save User
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	//Get User
	public User getUserById(int id) {
		Optional<User> optional = userRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
	
	//Get all Users
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//Update User
	public User updateUser(User user, int id) {
		User findingUser = getUserById(id);
		if(findingUser != null) {
			findingUser.setNom(user.getNom());
			findingUser.setEmail(user.getEmail());
			userRepository.save(findingUser);
			return findingUser;
		}
		return null;
	}
	
	//Delete User
	public boolean deleteUser(int id) {
		User user = getUserById(id);
		if(user != null) {
			userRepository.delete(user);
			return true;
		}
		return false;
	}
	
	
}
