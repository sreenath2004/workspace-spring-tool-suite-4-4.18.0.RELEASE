package com.EducationalLoanPortal1.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoanPortal1.demo.repository.LoanApplicationRepository;
import com.EducationalLoanPortal1.demo.repository.UserRepository;
import com.EducationalLoanPortal1.demo.model.LoanApplicationModel;
import com.EducationalLoanPortal1.demo.model.UserModel;

@Service
public class UserModelService {
	@Autowired
	UserRepository userRep;
	@Autowired
	LoanApplicationRepository laRep;
	//post
	public UserModel saveUser(UserModel l)
	{
		return userRep.save(l);
	}
	public String valideteUser(String email,String password)
	{
		String result=" ";
		UserModel l=userRep.findByEmail(email);
		if(l==null)
		{
			result="User not found";
		}
		else
		{
			if(l.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}
	//get
	public List<UserModel> get()
	{
		List<UserModel> um=userRep.findAll();
		return um;
	}
	//getbyid
	public LoanApplicationModel getById(int id)
	{
		LoanApplicationModel gbi=laRep.findById(id).get();
		return gbi;
		
	}
	//put
	public  UserModel updateinfo(UserModel s,int id) {
		Optional<UserModel> optional=userRep.findById(id);
		UserModel obj=null;
		if(optional.isPresent())
		{
		obj=optional.get();

		userRep.save(s);
		}
		return obj;


		}
	//delete
	public void deleteDetails(int id)
	{
		userRep.deleteById(id);
	}

}
