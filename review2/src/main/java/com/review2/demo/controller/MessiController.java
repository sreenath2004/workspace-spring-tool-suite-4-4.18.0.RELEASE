package com.review2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review2.demo.model.Messi;
import com.review2.demo.service.MessiService;

@RestController
public class MessiController {
	@Autowired
	MessiService mesService;
	@GetMapping("/sreenath")
	public List<Messi> getAllPlayers(){
		List<Messi> mesList = mesService.getAllPlayer();
		return mesList;
	}
	@PostMapping(value="/postfootball")
	public Messi saveMessi(@RequestBody Messi m)
	{
		return mesService.saveMessi(m);
	}
	@PutMapping(value="/updatefootball")
	public  Messi updateMessi(@RequestBody Messi m)
	{
		return mesService.saveMessi(m);
	}
	
	@DeleteMapping(value="/deleteMessi/{sno}")
	public void  deleteMessi(@PathVariable("sno")  int sno)
	{
	   mesService.deleteMessi(sno);
	}
}
