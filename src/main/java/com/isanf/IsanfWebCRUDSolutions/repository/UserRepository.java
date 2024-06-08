/**
 * 
 */
package com.isanf.IsanfWebCRUDSolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.UserOld;

/**
 * 
 */
public interface UserRepository extends JpaRepository<UserOld, Integer>{

}
