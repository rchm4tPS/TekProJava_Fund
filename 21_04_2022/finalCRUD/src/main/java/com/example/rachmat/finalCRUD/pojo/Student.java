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
	@Column(name = "tempat_lahir")
	private String tempat_lahir;
	@Column(name = "makanan_favorit")
	private String makanan_favorit;
	
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
	
	public String getTempat_lahir() {
		return tempat_lahir;
	}

	public void setTempat_lahir(String tempat_lahir) {
		this.tempat_lahir = tempat_lahir;
	}

	public String getMakanan_favorit() {
		return makanan_favorit;
	}

	public void setMakanan_favorit(String makanan_favorit) {
		this.makanan_favorit = makanan_favorit;
	}

	@Override
	public String toString() {
		return "{id: " + id
				+ ", name: " + name
				+ ", tempat_lahir: " + tempat_lahir
				+ ", makanan_favorit: " + makanan_favorit
				+ "}";
	}

}
