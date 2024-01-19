package com.GuviAppBackend.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GuviAppBackend.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);
	
	boolean existsByUsername(String username);

}
