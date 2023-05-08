package com.EducationalLoanPortal1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationalLoanPortal1.demo.model.LoanApplicationModel;



@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer>{

}
