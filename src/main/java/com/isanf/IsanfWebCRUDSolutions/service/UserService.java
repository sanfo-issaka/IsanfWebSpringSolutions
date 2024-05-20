package com.isanf.IsanfWebCRUDSolutions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.User;
import com.isanf.IsanfWebCRUDSolutions.repository.dao.UserDao;
import com.isanf.IsanfWebCRUDSolutions.service.dto.ResponseStructure;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	//save
	public ResponseStructure<User> saveUser(User user){
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		User savedUser = userDao.saveUser(user);
		if(savedUser != null) {
			responseStructure.setData(savedUser);
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setMessage("Utilisateur enregistré.");
		} else {
			responseStructure.setData(null);
			responseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
			responseStructure.setMessage("Utilisateur non enregistré.");
		}
		return responseStructure;
	}
	
	//get
	public ResponseStructure<User> getUserById(Integer id){
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		User user = userDao.getUserById(id);
		if(user != null) {
			responseStructure.setData(user);
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMessage("Utilisateur trouvé.");
		} else {
			responseStructure.setData(null);
			responseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
			responseStructure.setMessage("Utilisateur non trouvé.");
		}
		return responseStructure;
	}
	//get all
	public ResponseStructure<List<User>> getAllUsers(){
		 ResponseStructure<List<User>>  responseStructure = new  ResponseStructure<List<User>>();
		 List<User> usersList = userDao.getAllUsers();
		 if(usersList.size() > 0) {
			responseStructure.setData(usersList);
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMessage("Liste retournée avec succès.");
		 } else {
			responseStructure.setData(null);
			responseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
			responseStructure.setMessage("Liste vide.");
		 }
		 return responseStructure;
	}
	
	//update
	public ResponseStructure<User> updateUser(User user, Integer id){
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		User updatedUser = userDao.updateUser(user, id);
		if(updatedUser != null) {
			responseStructure.setData(updatedUser);
			responseStructure.setStatusCode(HttpStatus.RESET_CONTENT.value());
			responseStructure.setMessage("Utilisateur mis à jour.");
		} else {
			responseStructure.setData(null);
			responseStructure.setStatusCode(HttpStatus.EXPECTATION_FAILED.value());
			responseStructure.setMessage(HttpStatus.EXPECTATION_FAILED.getReasonPhrase());
		}
		return responseStructure;
	}
	
	//delete
	public ResponseStructure<String> deleteUser(Integer id){
		ResponseStructure<String>  responseStructure = new ResponseStructure<String>();
		boolean isDeleted = userDao.deleteUser(id);
		if(isDeleted) {
			responseStructure.setData("Utilisateur supprimé");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMessage(HttpStatus.OK.getReasonPhrase());
		} else {
			responseStructure.setData("Utilisateur pas supprimé");
			responseStructure.setStatusCode(HttpStatus.EXPECTATION_FAILED.value());
			responseStructure.setMessage(HttpStatus.EXPECTATION_FAILED.getReasonPhrase());
		}
		return responseStructure;
	}
}
