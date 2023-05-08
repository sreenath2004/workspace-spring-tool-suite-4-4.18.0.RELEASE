package com.example.EducationalLoanPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoanPortal.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{
	UserModel findByEmail(String email);

}
