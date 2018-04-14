package com.caveofprogramming.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caveofprogramming.spring.web.dao.login;
import com.caveofprogramming.spring.web.dao.loginDAO;

@Service("loginService")
public class loginService {
	
	private loginDAO logindao;
	
	
    @Autowired	
	public void setLogindao(loginDAO logindao) {
		this.logindao = logindao;
	}



	public List<login> getCurrent(){
		return logindao.getNames();
	}

}
