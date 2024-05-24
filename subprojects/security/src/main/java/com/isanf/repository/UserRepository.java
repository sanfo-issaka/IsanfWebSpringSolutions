package com.isanf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isanf.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
