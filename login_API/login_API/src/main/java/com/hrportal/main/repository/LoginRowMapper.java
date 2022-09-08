package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.LoginAPI;


public class LoginRowMapper  implements RowMapper<LoginAPI>
{
	
	@Override
	public LoginAPI mapRow(ResultSet rs, int rowNum) throws SQLException {
		String login_id=rs.getString("login_id"); 
		String user_name =rs.getString("user_name"); 
		String password =rs.getString("password"); 
		String designation  =rs.getString("designation"); 
		LoginAPI loginAPI = new LoginAPI(login_id, user_name, password, designation);
		
		return loginAPI;
	}

}
//Address address = new Address(addressId, buildingName, street, city, pin);