/**
 * 
 */
package com.isanf.IsanfWebCRUDSolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.User;

/**
 * 
 */
public interface UserRepository extends JpaRepository<User, Integer>{

}
