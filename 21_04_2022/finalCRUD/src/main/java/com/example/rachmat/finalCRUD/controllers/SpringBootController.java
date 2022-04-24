package com.example.rachmat.finalCRUD.controllers;

import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rachmat.finalCRUD.pojo.Student;
import com.example.rachmat.finalCRUD.repository.JdbcFinalCrudRepository;

@RestController
public class SpringBootController {
	
	@Autowired
	JdbcFinalCrudRepository jdbcfcr;
	
	@PostMapping("/addNewStudents")
	public String addNewData(@RequestBody Student student) {
		
		int successfullyAdded = jdbcfcr.save(student);
		
		return "Succesfully add new data. The number of record affected : "+successfullyAdded;
	}
	
	@PutMapping("/updateById/{id}")
	public String updateData(@PathVariable("id") int id, @RequestBody Student student) {
		Student _student = jdbcfcr.findById(id);
		
		if (_student != null) {
			_student.setId(student.getId());
			_student.setName(student.getName());
			_student.setTempat_lahir(student.getTempat_lahir());
			_student.setMakanan_favorit(student.getMakanan_favorit());
			jdbcfcr.update(_student);
			return "Successfully updated!";
		}
		else {
			return "Aborted! There's no such ID in database!";
		}
	}
	
	@GetMapping("/getStudentById/{id}")
	public List<Student> getStudentById(@PathVariable("id") int id){
		List<Student> studentFound = new ArrayList<Student>();
		
		Student _student = jdbcfcr.findById(id);
		
		if (_student != null) {
			studentFound.add(_student);
			return studentFound;
		}
		else {
			return null;
		}
	}
	
	@DeleteMapping("deleteDataById/{id}")
	public String deleteOneStudent(@PathVariable("id") int id) {
		try {
			int result = jdbcfcr.deleteById(id);
			if (result == 0)
				return "Cannot find record with ID "+id+" !";
			return "Students was deleted successfully!";
		} catch (Exception e) {
			return "Cannot handle this operation!";
		}
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> StudentInfo(){
		
		List<Student> student = jdbcfcr.findAll();
		
		return student;
	}
	
	
	@GetMapping("/searchByName")
	public List<Student> searchByName(@RequestParam(required = true) String name){
		
		List<Student> student = jdbcfcr.findByName(name);
		
		return student;
	}
	
	
	@DeleteMapping("/deleteAllData")
	public String deleteAll() {
		try {
			jdbcfcr.deleteAll();
			return "Successfully delete the whole record! Now it's empty!";
		} catch (Exception e) {
			return "Sorry, we couldn't do this operation now.";
		}
	}
	
}
