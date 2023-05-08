package com.review2.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.review2.demo.model.Football;
import com.review2.demo.service.FootballService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class FootballController {
	@Autowired
	FootballService mesService;
    @Tag(name="Get All Players",description="Get All")
	@GetMapping("/getfootball")
	public List<Football> getAllPlayers(){
		List<Football> mesList = mesService.getAllPlayer();
		return mesList;
	}
    @Tag(name="Post All Players",description="Post new")
	@PostMapping(value="/postfootball")
	public Football saveFootball(@RequestBody Football m)
	{
		return mesService.saveFootball(m);
	}
    @Tag(name="Put All Players",description="Put All")
	@PutMapping(value="/updatefootball/{rno}")
    public Football updateFootball(@RequestBody Football m, @PathVariable("rno") int sno)
    {
    	return mesService.updateFootball(m,sno);
    }
    @Tag(name="Delete All Players",description="Delete All")
	@DeleteMapping(value="/deletefootball/{sno}")
	public void  deleteFootball(@PathVariable("sno")  int sno)
	{
	   mesService.deleteFootball(sno);
	}
    @Tag(name="sort Players",description="sort All")
	@GetMapping("/sortfootball/{name}")
    public List<Football> sortFootball(@PathVariable String name)
    {
    	return mesService.sortFootball(name);
    }
    @Tag(name="paginate Players",description="paginate All")
    @GetMapping("pagination/{nm}/{sp}")
	public List<Football> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)
	{
		return mesService.paginate(num,size);
	}
    @Tag(name="sort and paginate Players",description="sort and paginate All")
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Football> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return mesService.paginate(num,size,name);
		
	}
    @Tag(name="fetch prefix players name",description="fetch by prefix")
	@GetMapping("/fetchPrefix")
	public List<Football> fetchPlayerByNamePrefix(@RequestParam String prefix)
	{
		return mesService.fetchPlayerByNamePrefix(prefix);
	}
    @Tag(name="fetch suffix players name",description="fetch by suffix")
	@GetMapping("/fetchSuffix")
	public List<Football> fetchPlayerByNameSuffix(@RequestParam String suffix)
	{
		return mesService.fetchPlayerByNameSuffix(suffix);
	}
	@GetMapping("/fetchByCountry")
	public List<Football> fetchPlayerByCountry(@RequestParam String country)
	{
		return mesService.fetchPlayerByCountry(country);
	}
	@GetMapping("/fetchPlayerByCountry/{country}/{name}")
	public List<Football> fetchPlayerByCountry(@PathVariable String country,@PathVariable String name)
	{
		return mesService.getPlayerByCountry(country, name);
	}
	@DeleteMapping("/deletePlayerByName/{name}")
    public String deletePlayerByName(@PathVariable String name)
    {
 	   int result = mesService.deletePlayerByName(name);
 	   if(result>0)
 		     return "Player record deleted";
 	   else
 		     return "Problem occured while deleting";
    }
    @PutMapping("/updatePlayerByName/{country}/{name}")
    public String updatePlayerByName(@PathVariable String country,String name)
    {
 	   int res = mesService.updatePlayerByName(country,name);
 	   if(res>0)
 		      return "Player record updated";
 	   else
 		    return "Problem occured";                       
}
    @GetMapping("/fetchPlayerByCountry/{country}")
    public List<Football> fetchPlayerByCount(@PathVariable String country)
    {
    	return mesService.fetchPlayerByCount(country);
    }
}
