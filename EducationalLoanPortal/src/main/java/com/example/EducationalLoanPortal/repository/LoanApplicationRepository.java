package com.example.EducationalLoanPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoanPortal.model.LoanApplicationModel;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer>{

}
