package com.review2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review2.demo.model.PlayerParent;
import com.review2.demo.service.ParentChildService;

@RestController
public class ParentChildController {
	@Autowired
	ParentChildService apService;
	@GetMapping("/getAllParent")
     public List<PlayerParent> fetchAllParent()
	   {
		  return apService.fetchAllPersons();
	   }
	   @PostMapping("/saveAlldata")
	   public PlayerParent saveParent(@RequestBody PlayerParent p)
	   {
		   return apService.save(p);
}
}