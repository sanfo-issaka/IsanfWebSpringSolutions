/**
 * 
 */
package com.isanf.IsanfWebSpringSolutions.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isanf.IsanfWebSpringSolutions.domain.entity.UserOld;

/**
 * 
 */
public interface UserRepository extends JpaRepository<UserOld, Integer>{
	//R 15
	public Optional<UserOld> findAllByNom(String givenName);
}
