package com.review2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review2.demo.model.Loginpage;

@Repository
public interface LoginRepo extends JpaRepository<Loginpage,Integer> {
	
	Loginpage findByUsername(String username);

}
