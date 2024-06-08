package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("FROM User")
    List<User> findAllUsers();
    //R 23
    @Query("FROM User WHERE id = :id")
    User findUserById(@Param("id") Long id);

    @Query("FROM User WHERE name = :name")
    List<User> findUsersByName(@Param("name") String name);
}
