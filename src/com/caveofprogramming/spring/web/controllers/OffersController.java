package com.caveofprogramming.spring.web.controllers;

import java.util.Map;
import java.util.List;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.caveofprogramming.spring.web.dao.login;
import com.caveofprogramming.spring.web.service.loginService;

@Controller
public class OffersController {
	/*
	@RequestMapping("/")
	public ModelAndView showHome()
	{
		ModelAndView mv = new ModelAndView("home");
		Map<String, Object> model = mv.getModel();
		
		model.put("name", "River");
		
		return mv;
	}
*/

	private loginService loginservice;
	
	
	@Autowired
	public void setLoginservice(loginService loginservice) {
		this.loginservice = loginservice;
	}



	@RequestMapping("/")
	public String showHome(Model model)
	{
		List<login> login = loginservice.getCurrent();
		
			model.addAttribute("login",login);
		return "home";
	}
	
}
