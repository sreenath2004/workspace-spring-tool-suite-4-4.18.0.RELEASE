package com.example.EducationalLoanPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoanPortal.repository.LoanApplicationRepository;
import com.example.EducationalLoanPortal.model.LoanApplicationModel;

@Service
public class LoanApplicationService {
	@Autowired
	LoanApplicationRepository laRep;
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laRep.findAll();
		return l;
	}

}
