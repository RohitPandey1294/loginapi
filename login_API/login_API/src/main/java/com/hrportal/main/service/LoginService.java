package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.domain.LoginAPI;
import com.hrportal.main.repository.LoginRepository;
import com.hrportal.main.repository.LoginRepositoryInterface;

@Service
public class LoginService implements LoginServiceInterface {
	@Autowired
	private LoginRepositoryInterface loginRepositoryInterface;

	@Override
	public List<LoginAPI> getallLoginAPIList() {
		// TODO Auto-generated method stub
		return loginRepositoryInterface.getallLoginAPIList();
	}

	@Override
	public LoginAPI getLoginAPIbyLoginId(String loginId) {
		// TODO Auto-generated method stub
		return loginRepositoryInterface.getLoginAPIbyLoginId(loginId);
	}
}
