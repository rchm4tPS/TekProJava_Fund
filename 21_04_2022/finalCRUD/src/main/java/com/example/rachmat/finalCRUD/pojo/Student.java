package com.example.rachmat.finalCRUD.pojo;

import javax.persistence.*;

@Entity
@Table(name = "students_d4")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "name")
	private String name;
	
	public Student() {
//		this.id = 0;
//		this.name = "default";
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{id: " + id
				+ ", name: " + name
				+ "}";
	}

}
