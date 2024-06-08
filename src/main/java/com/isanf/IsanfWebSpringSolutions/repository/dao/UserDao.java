package com.isanf.IsanfWebSpringSolutions.repository.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isanf.IsanfWebSpringSolutions.domain.entity.UserOld;
import com.isanf.IsanfWebSpringSolutions.repository.UserRepository;

import jakarta.websocket.Session;

@Repository
public class UserDao {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
    private SessionFactory sessionFactory;

	//R 16
    // HQL to retrieve all users
	@Transactional
    public List<UserOld> getAllUsersHQL() {
        Session session = (Session) sessionFactory.getCurrentSession();
        Query<UserOld> query = ((org.hibernate.Session) session).createQuery("FROM UserOld", UserOld.class);
        return query.list();
    }
	
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
	
	//R 15
	public UserOld findAllByGivenName(String name) {
		Optional<UserOld> optional = userRepository.findAllByNom(name);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
	
	
}
