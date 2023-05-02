package com.vikram.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.demo.model.Student;
import com.vikram.demo.service.StudentService;
@RestController
public class StudentController {
	@Autowired
   StudentService studsService;
	@GetMapping("/1986")
   public List<Student> getAllStudents()
   {
	   List<Student> studsList = studsService.getAllStudents();
	   return studsList;
   }
	//http://localhost:8080/saveStudent
	@PostMapping(value="/saveStudent")
	public Student saveStudent(@RequestBody Student s)
	{
		return studsService.saveStudent(s);
	}
	@PutMapping(value="/updateStudent/{rno}")
    public Student updateStudent(@RequestBody Student s, @PathVariable int regno)
    {
    	
    	return studsService.updateStudent(s,regno);
    		
    }
	@DeleteMapping(value="deleteStudent/{rno}")
	public void deleteStudent(@PathVariable("rno") int regno)
	{
		studsService.deleteStudent(regno);
	}
	@GetMapping(value="/getStudent/{rno}")
	public Student getStudent(@PathVariable("rno") int regno)
	{
		return studsService.getStudent(regno);
	}
	@GetMapping("/sortStudent/{name}")
    public List<Student> sortStudents(@PathVariable String name)
    {
    	return studsService.sortStudents(name);
    }
    @GetMapping("pagination/{nm}/{sp}")
	public List<Student> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)
	{
		return studsService.paginate(num,size);
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Student> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return studsService.paginate(num,size,name);
		
	}
}
