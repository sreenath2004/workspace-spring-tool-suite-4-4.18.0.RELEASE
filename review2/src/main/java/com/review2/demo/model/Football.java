package com.review2.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Football {
	@ Id
    private int sno;
	private String name;
    private String country;
    private int age;
    private String goals;
    private String assists;
    private String curclub;
    private String foot;
    private String rating;
    private String tropies;
    private int userid;
	private String username;
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getAssists() {
		return assists;
	}
	public void setAssists(String assists) {
		this.assists = assists;
	}
	public String getCurclub() {
		return curclub;
	}
	public void setCurclub(String curclub) {
		this.curclub = curclub;
	}
	public String getFoot() {
		return foot;
	}
	public void setFoot(String foot) {
		this.foot = foot;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getTropies() {
		return tropies;
	}
	public void setTropies(String tropies) {
		this.tropies = tropies;
	}
    

}
