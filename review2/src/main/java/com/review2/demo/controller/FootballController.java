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


@RestController
public class FootballController {
	@Autowired
	FootballService mesService;
	@GetMapping("/getfootball")
	public List<Football> getAllPlayers(){
		List<Football> mesList = mesService.getAllPlayer();
		return mesList;
	}
	@PostMapping(value="/postfootball")
	public Football saveFootball(@RequestBody Football m)
	{
		return mesService.saveFootball(m);
	}
	@PutMapping(value="/updatefootball/{rno}")
    public Football updateFootball(@RequestBody Football m, @PathVariable("rno") int sno)
    {
    	return mesService.updateFootball(m,sno);
    }
	
	@DeleteMapping(value="/deletefootball/{sno}")
	public void  deleteFootball(@PathVariable("sno")  int sno)
	{
	   mesService.deleteFootball(sno);
	}
	@GetMapping("/sortfootball/{name}")
    public List<Football> sortFootball(@PathVariable String name)
    {
    	return mesService.sortFootball(name);
    }
    @GetMapping("pagination/{nm}/{sp}")
	public List<Football> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)
	{
		return mesService.paginate(num,size);
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Football> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return mesService.paginate(num,size,name);
		
	}
	@GetMapping("/fetchPrefix")
	public List<Football> fetchPlayerByNamePrefix(@RequestParam String prefix)
	{
		return mesService.fetchPlayerByNamePrefix(prefix);
	}
	@GetMapping("/fetchSuffix")
	public List<Football> fetchPlayerByNameSuffix(@RequestParam String suffix)
	{
		return mesService.fetchPlayerByNameSuffix(suffix);
	}
	@GetMapping("/fetchByDept")
	public List<Football> fetchPlayerByCountry(@RequestParam String country)
	{
		return mesService.fetchPlayerByCountry(country);
	}
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = mesService.loginCheckData(username, password);
		return result;
	}
}
