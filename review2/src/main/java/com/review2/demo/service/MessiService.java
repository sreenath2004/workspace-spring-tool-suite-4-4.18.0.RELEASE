package com.review2.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review2.demo.model.Messi;
import com.review2.demo.repository.MessiRepository;

@Service
public class MessiService {
 @Autowired
 MessiRepository mesRepository;
 public List<Messi> getAllPlayer(){
	 List<Messi> mesList = mesRepository.findAll();
	 return mesList;
 }
 public Messi saveMessi(Messi m) {
	 Messi obj = mesRepository.save(m);
	 return obj;
 }
 public Messi updateMessi(Messi m) {
	 Messi obj = mesRepository.save(m);
	 return obj;
 }
 public void deleteMessi(int sno)
 {
	 mesRepository.deleteById(sno);
}
}