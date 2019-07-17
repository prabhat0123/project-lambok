package com.peekay.lambok.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Student {

	@Id @GeneratedValue
	Long id;
	String firstName;
	String lastName;
	String email;
	Date dob;
	
	@Getter 
	@Setter
	Boolean active;

	private Student() {

	}

}
