package com.restApi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class bookRecords {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nameOfName;
	private String autherName;

	@Override
	public String toString() {
		return "bookRecords [id=" + id + ", nameOfName=" + nameOfName + ", autherName=" + autherName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfName() {
		return nameOfName;
	}

	public void setNameOfName(String nameOfName) {
		this.nameOfName = nameOfName;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public bookRecords(int id, String nameOfName, String autherName) {
		super();
		this.id = id;
		this.nameOfName = nameOfName;
		this.autherName = autherName;
	}

	public bookRecords() {
		super();
		// TODO Auto-generated constructor stub
	}

}
