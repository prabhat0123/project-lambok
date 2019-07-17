package com.peekay.lambok.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {

	@Id @GeneratedValue
	Long id;
	String firstName;
	String lastName;
	String email;
	Date dob;

	Boolean active;

}
