package com.EducationalLoanPortal1.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoanPortal1.demo.repository.LoanApplicationRepository;
import com.EducationalLoanPortal1.demo.model.LoanApplicationModel;

@Service
public class LoanApplicationService {
	@Autowired
	LoanApplicationRepository laRep;
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laRep.findAll();
		return l;
	}
	public void deleteDetails(int id)
	{
		laRep.deleteById(id);
	}
	public LoanApplicationModel saveUser(LoanApplicationModel l)
	{
		return laRep.save(l);
	}

}
