package com.vikram.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Student updateStudent(Student s) {
    	Student obj = studsRepository.save(s);
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
}
