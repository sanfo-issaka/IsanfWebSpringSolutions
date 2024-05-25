package com.isanf.IsanfWebCRUDSolutions.repository.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.UserOld;
import com.isanf.IsanfWebCRUDSolutions.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	UserRepository userRepository;
	
	//Save User
	public UserOld saveUser(UserOld user) {
		return userRepository.save(user);
	}
	
	//Get User
	public UserOld getUserById(int id) {
		Optional<UserOld> optional = userRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
	
	//Get all Users
	public List<UserOld> getAllUsers(){
		return userRepository.findAll();
	}
	
	//Update User
	public UserOld updateUser(UserOld user, int id) {
		UserOld findingUser = getUserById(id);
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
		UserOld user = getUserById(id);
		if(user != null) {
			userRepository.delete(user);
			return true;
		}
		return false;
	}

	//R 19
	public UserOld findAllByGivenName(String name) {
		Optional<UserOld> optional = userRepository.findAllByNom(name);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
	
	
}
