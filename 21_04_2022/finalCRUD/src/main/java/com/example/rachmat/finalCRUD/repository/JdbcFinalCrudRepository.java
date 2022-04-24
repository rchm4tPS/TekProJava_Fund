package com.example.rachmat.finalCRUD.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.rachmat.finalCRUD.pojo.Student;

@Repository
public class JdbcFinalCrudRepository implements FinalCrudRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Student student) {
		return jdbcTemplate.update("INSERT INTO students_d4 (id,name) VALUES(?,?)",
				new Object[] {student.getId(), student.getName()});
	}

	@Override
	public int update(Student student) {
		return jdbcTemplate.update("UPDATE students_d4 SET name=? WHERE students_d4.id=?",
				new Object[] {student.getName(), student.getId()});
	}

	@Override
	public Student findById(int id) {
		try {
			Student student = jdbcTemplate.queryForObject("SELECT * FROM students_d4 WHERE id=?",
					BeanPropertyRowMapper.newInstance(Student.class), id);
			
			return student;
		}
		catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("DELETE FROM students_d4 WHERE id=?", id);
	}

	@Override
	public List<Student> findAll() {
		return jdbcTemplate.query("SELECT * from students_d4", BeanPropertyRowMapper.newInstance(Student.class));
	}

	@Override
	public List<Student> findByName(String name) {
		return jdbcTemplate.query("SELECT * from students_d4 WHERE name=?",
				BeanPropertyRowMapper.newInstance(Student.class), name);
	}

	@Override
	public int deleteAll() {
		return jdbcTemplate.update("DELETE from students_d4");
	}
}
