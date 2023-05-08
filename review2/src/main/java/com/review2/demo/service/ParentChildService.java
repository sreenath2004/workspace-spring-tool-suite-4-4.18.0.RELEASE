package com.review2.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review2.demo.model.PlayerParent;
import com.review2.demo.repository.PlayerParentRepo;

@Service
public class ParentChildService {
	@Autowired
	PlayerParentRepo perRepository;
	public List<PlayerParent> fetchAllPersons()
	   {
		   return perRepository.findAll();
	   }
    public PlayerParent save(PlayerParent p)
	   {
		   return perRepository.save(p);
	   }
}
