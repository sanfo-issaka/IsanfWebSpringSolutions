/**
 * 
 */
package com.isanf.IsanfWebSpringSolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isanf.IsanfWebSpringSolutions.domain.entity.UserOld;

/**
 * 
 */
public interface UserRepository extends JpaRepository<UserOld, Integer>{

}
