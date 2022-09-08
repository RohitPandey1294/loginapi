package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.domain.LoginAPI;

public interface LoginServiceInterface {
	public List<LoginAPI> getallLoginAPIList();
	public LoginAPI getLoginAPIbyLoginId(String loginId);}
