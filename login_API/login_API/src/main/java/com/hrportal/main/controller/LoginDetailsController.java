package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.domain.LoginAPI;
import com.hrportal.main.service.LoginServiceInterface;

@RestController
@RequestMapping("loginapi")
public class LoginDetailsController {

	@Autowired
	private LoginServiceInterface loginServiceInterface;

	// http://localhost:8080/loginapi/login
	@RequestMapping(value = "login/all", method = RequestMethod.GET)
	public List<LoginAPI> getallLoginAPIList() {
		return loginServiceInterface.getallLoginAPIList();

	}
	
	@RequestMapping (value="login/{loginId}",method = RequestMethod.GET)
	public LoginAPI getLoginAPIbyLoginId(@PathVariable String loginId) {
		return loginServiceInterface.getLoginAPIbyLoginId(loginId);
	}

}
