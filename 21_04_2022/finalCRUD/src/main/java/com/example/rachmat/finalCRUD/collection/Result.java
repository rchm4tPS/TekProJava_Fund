package com.example.rachmat.finalCRUD.collection;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("tempat_lahir")
	@Expose
	private String tempat_lahir;
	@SerializedName("makanan_favorit")
	@Expose
	private String makanan_favorit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

}