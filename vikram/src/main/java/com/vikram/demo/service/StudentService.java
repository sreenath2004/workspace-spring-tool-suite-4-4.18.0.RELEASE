package com.vikram.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vikram.demo.model.Student;
import com.vikram.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studsRepository;
	public List<Student> getAllStudents()
	{
		List<Student> studList = studsRepository.findAll();
		return studList;
	}
    public Student saveStudent(Student s) {
    	Student obj = studsRepository.save(s);
    	return obj;
    	
    	
    }
    public  Student updateStudent(Student s,int regno) {
		Optional<Student> optional=studsRepository.findById(regno);
		Student obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
//			obj.setRegno(s.getRegno());
//			obj.setName(s.getName());
//			obj.setDept(s.getDept());
//			obj.setMail(s.getMail());
		studsRepository.save(s);
			
		}
		return obj;
	}
    public void deleteStudent(int regno)
    {
    	studsRepository.deleteById(regno);
    }
    public Student getStudent(int regno)
    {
    	Student s=studsRepository.findById(regno).get();
    	return s;
    }
    public List<Student> sortStudents(String name) 
	{
	    return studsRepository.findAll(Sort.by(name));
		
	}
	public List<Student> paginate(int num, int size) 
	{
		Page<Student> p=studsRepository.findAll(PageRequest.of(num, size));
		return p.getContent();
		
	}
	public List<Student> paginate(int num, int size, String name) 
	{
		Page<Student> obj=studsRepository.findAll(PageRequest.of(num, size,Sort.by(name)));
		return obj.getContent();
	}
}
