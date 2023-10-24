package com.demo.Studentmanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Entity
@Table(name="students")
public class Student {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	 private Long Id;
	
	@Column(name="first_name", nullable= false)
	 private String firstName;
	
	@Column(name="last_name")
	 private String lastName;
	
	@Column(name="email")
	 private String email;
	
	 public Student() {
		 
	 }
	 public Long getId() {
		return Id;
	}
	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
}
