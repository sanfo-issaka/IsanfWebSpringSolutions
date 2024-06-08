package com.isanf.IsanfWebSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.isanf.IsanfWebSpring.domain.entity.UserOld;
import com.isanf.IsanfWebSpring.repository.dao.UserDao;
import com.isanf.IsanfWebSpring.service.dto.ResponseStructure;

//R 11
@Service
public class UserService {

	@Autowired
	UserDao userDao;

	
	//save
	public ResponseStructure<UserOld> saveUser(UserOld user){
		ResponseStructure<UserOld> responseStructure = new ResponseStructure<UserOld>();
		UserOld savedUser = userDao.saveUser(user);
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
	public ResponseStructure<UserOld> getUserById(Integer id){
		ResponseStructure<UserOld> responseStructure = new ResponseStructure<UserOld>();
		UserOld user = userDao.getUserById(id);
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
	public ResponseStructure<List<UserOld>> getAllUsers(){
		 ResponseStructure<List<UserOld>>  responseStructure = new  ResponseStructure<List<UserOld>>();
		 List<UserOld> usersList = userDao.getAllUsers();
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
	public ResponseStructure<UserOld> updateUser(UserOld user, Integer id){
		ResponseStructure<UserOld> responseStructure = new ResponseStructure<UserOld>();
		UserOld updatedUser = userDao.updateUser(user, id);
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
	
	//R 15
	public ResponseStructure<UserOld> findAllByGivenName(String name) {
		ResponseStructure<UserOld> responseStructure = new ResponseStructure<UserOld>();
		UserOld user = userDao.findAllByGivenName(name);
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
	
}
