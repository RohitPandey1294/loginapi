package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.domain.LoginAPI;

public interface LoginRepositoryInterface 
{
	public List<LoginAPI> getallLoginAPIList();
	public LoginAPI getLoginAPIbyLoginId(String loginId);
}
