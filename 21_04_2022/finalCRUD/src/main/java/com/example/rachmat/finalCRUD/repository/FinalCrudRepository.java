package com.example.rachmat.finalCRUD.repository;

import java.util.List;

import com.example.rachmat.finalCRUD.pojo.Student;

public interface FinalCrudRepository {
	int save(Student student);
	
	int update(Student student);
	
	Student findById(int id);
	
	int deleteById(int id);
	
	List<Student> findAll();
	
	List<Student> findByName(String name);
	
	int deleteAll();
}
