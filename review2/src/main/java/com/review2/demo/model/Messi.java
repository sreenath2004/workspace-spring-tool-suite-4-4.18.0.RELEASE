package com.review2.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Messi {
	@Id
    private int sno;
    public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
    private String country;
    private int age;
}
