package com.conneqtor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "USERS")
public class User {
	
	@Id
	@Column(name="USER_ID")
	@SequenceGenerator(name="USER_SEQ", sequenceName="USER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ")
	@Qualifier("userId")
	private int userId;
	
	@Column(name="FIRST_NAME")
	@Qualifier("firstName")
	private String firstName;
	
	@Column(name="LAST_NAME")
	@Qualifier("lastName")
	private String lastName;
	
	@Column(name="EMAIL")
	@Qualifier("email")
	private String email;
	
	@Column(name="PASSWORD")
	@Qualifier("password")
	private String password;
	
	@Column(name="TYPE_ID")
	@Qualifier("typeId")
	private int typeId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", typeId=" + typeId + "]";
	}
	
}


