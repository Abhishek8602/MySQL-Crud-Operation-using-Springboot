package com.project.MysqlCrudProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.MysqlCrudProject.domain.Student;
import com.project.MysqlCrudProject.repository.Repo;

@Service
public class StudentService {
	
	 @Autowired
	    private Repo repo;
	    
	    public List<Student> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Student std) {
	        repo.save(std);
	    }
	     
	    public Student get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }

}
