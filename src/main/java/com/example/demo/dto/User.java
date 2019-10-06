package com.example.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class User {

	Long id;
	
   @NotNull
   @Size(min=5, message="Name must be at least 5 characters long")
   String name;
   
   @NotNull
   @Size(min=5, message="Email must be at least 5 characters long")
   String email;
   
   String gender;
   
   public User(Long id, String name, String email , String gender)
   {
	   this.id = id;
	   this.name = name;
	   this.email = email;
	   this.gender = gender;
   }
   public User()
   {
	   
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}