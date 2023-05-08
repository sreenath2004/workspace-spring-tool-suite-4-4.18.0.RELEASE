package com.EducationalLoanPortal1.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EducationalLoanPortal1.demo.model.LoanApplicationModel;
import com.EducationalLoanPortal1.demo.service.LoanApplicationService;

@RestController
@RequestMapping("/admin")
public class LoanApplicationController {
	@Autowired
	LoanApplicationService laSer;
	@GetMapping(value="/getAllLoans")
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laSer.get();
		return l;
	}
	@DeleteMapping("/deleteuser/{sid}")
	  public String deleteDetails(@PathVariable("sid") int hid)
	  {
		  laSer.deleteDetails(hid);
		  return " deleted";
	}
	@PostMapping("/postloan")
	public LoanApplicationModel addDetails(@RequestBody LoanApplicationModel u)
	{
		return laSer.saveUser(u);
	}

}


