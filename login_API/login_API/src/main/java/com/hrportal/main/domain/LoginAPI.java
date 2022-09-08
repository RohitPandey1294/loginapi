package com.hrportal.main.domain;

import java.util.Objects;

public class LoginAPI {
 
	String login_id=""; 
	String user_name =""; 
	String password =""; 
	String designation  =""; 
	
	public LoginAPI() {
		
	}

	public LoginAPI(String login_id, String user_name, String password, String designation) {
		super();
		this.login_id = login_id;
		this.user_name = user_name;
		this.password = password;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "LoginAPI [login_id=" + login_id + ", user_name=" + user_name + ", password=" + password
				+ ", designation=" + designation + "]";
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, login_id, password, user_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginAPI other = (LoginAPI) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(login_id, other.login_id)
				&& Objects.equals(password, other.password) && Objects.equals(user_name, other.user_name);
	}
	
    
}
