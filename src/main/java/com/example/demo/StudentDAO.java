package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {
	@Autowired
	Studentrepo repo;

	public Student insert(Student s) {
	return	repo.save(s);
	}
	
	
	public List<Student> getAll(){
		return repo.findAll();
	}
	
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	
	

	//db-table - 1 karthik k@c.c
	                         
	
	                     //      1 prasad-update
	public Student updatebyname(Student s) {
		/* >find the id ->Student record
		 * >store the details into an object of student
		 * >set the value what u want to change
		 * >do the insertion 
		 * 
		 * */
		//db-table - 1 karthik k@c.c->ss
		Student ss=repo.findById(s.getSid()).orElse(null);
		ss.setName(s.getName());
	return	repo.save(ss);
		
	}
	
	
	
}
