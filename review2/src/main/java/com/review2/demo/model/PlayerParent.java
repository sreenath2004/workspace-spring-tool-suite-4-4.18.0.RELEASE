package com.review2.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PlayerParent {
	@Id
	@GeneratedValue
     private int id;
     private String name;
     private String email;
     private String password;
     @OneToOne(cascade=CascadeType.ALL)
     @JoinColumn(name="address_id")
     private PlayerChild playerchild;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public PlayerChild getPlayerchild() {
		return playerchild;
	}
	public void setPlayerchild(PlayerChild playerchild) {
		this.playerchild = playerchild;
	}
	@Override
	public String toString() {
		return "PlayerParent [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", playerchild=" + playerchild + "]";
	}
}
