package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.CST323ActivityApp;
import com.gcu.busiuness.OrdersBusinessInterface;
import com.gcu.busiuness.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

import groovy.util.logging.Slf4j;
@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController
{
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private OrdersBusinessInterface service;
	@Autowired
	private SecurityBusinessService security;
	@GetMapping("/")
	public String display(Model model)
	{
		logger.info("Entered /login");
		// display login form view
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		logger.info("Exited /login");
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model)
	{
		logger.info("Entered /doLogin");
		// Check for validation errors
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		service.test();
		security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		
		try
		{
			List<OrderModel> orders = service.getOrders();
		}
		catch(Exception e)
		{
			logger.error("Error log message");
			e.printStackTrace();
		}
		
		// Display the Orders view
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", service.getOrders());
		
		logger.info("Exited /doLogin");
		return "orders";
			
	}
}