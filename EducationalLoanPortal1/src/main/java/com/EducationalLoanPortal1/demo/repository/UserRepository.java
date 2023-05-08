package com.EducationalLoanPortal1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationalLoanPortal1.demo.model.UserModel;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{
	UserModel findByEmail(String email);

}
