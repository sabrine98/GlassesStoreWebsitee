package com.glassestoredb.entity2;
// Generated 21 juin 2020 11:00:46 by Hibernate Tools 5.3.16.Final

/**
 * Users generated by hbm2java
 */
public class Users implements java.io.Serializable {

	private Integer userId;
	private String email;
	private String password;
	private String fullName;

	public Users() {
	}

	public Users(String email, String password, String fullName) {
		this.email = email;
		this.password = password;
		this.fullName = fullName;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}