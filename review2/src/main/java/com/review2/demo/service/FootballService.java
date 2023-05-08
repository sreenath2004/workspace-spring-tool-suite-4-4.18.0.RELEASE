package com.review2.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.review2.demo.model.Football;
import com.review2.demo.repository.FootballRepository;

import jakarta.transaction.Transactional;
 


@Service
public class FootballService {
 @Autowired
 FootballRepository mesRepository;
 public List<Football> getAllPlayer(){
	 List<Football> mesList = mesRepository.findAll();
	 return mesList;
 }
 public Football saveFootball(Football m) {
	 Football obj = mesRepository.save(m);
	 return obj;
 }
 public  Football updateFootball(Football m,int sno) {
		Optional<Football> optional=mesRepository.findById(sno);
		Football obj=null;
		if(optional.isPresent())
		{
 			obj=optional.get();
            mesRepository.save(m);	
		}
		return obj;
	}
 public void deleteFootball(int sno)
 {
	 mesRepository.deleteById(sno);
} 
public List<Football> sortFootball(String name) 
	{
	    return mesRepository.findAll(Sort.by(name));
		
	}
public List<Football> paginate(int num, int size) 
{
	Page<Football> p=mesRepository.findAll(PageRequest.of(num, size));
	return p.getContent();
	
}
public List<Football> paginate(int num, int size, String name) 
{
	Page<Football> obj=mesRepository.findAll(PageRequest.of(num, size,Sort.by(name)));
	return obj.getContent();
}
 
 public List<Football> fetchPlayerByNamePrefix(String prefix)
	{
		return mesRepository.findByNameStartingWith(prefix);
	}
	public List<Football> fetchPlayerByNameSuffix(String suffix)
	{
		return mesRepository.findByNameEndingWith(suffix);
	}
	public List<Football> fetchPlayerByCountry(String country)
	{
		return mesRepository.findByCountry(country);
	}
	public List<Football> getPlayerByCountry(String country,String name)
	  {
		  return mesRepository.getPlayerByCountry(country,name);
	  }
	@Transactional 
	public int deletePlayerByName(String name)
	{
   	return mesRepository.deletePlayerByName(name);
	}
	@Transactional
	public int updatePlayerByName(String country,String name)
	{
		return mesRepository.updatePlayerByName(country, name);
	}
	public List<Football> fetchPlayerByCount(String country)
	{
		return mesRepository.fetchPlayerByCount(country);
	}
}