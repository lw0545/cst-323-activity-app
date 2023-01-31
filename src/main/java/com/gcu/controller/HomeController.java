package com.gcu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.busiuness.OrdersBusinessInterface;
import com.gcu.busiuness.SecurityBusinessService;
import com.gcu.model.LoginModel;

@Controller
@RequestMapping("/")
public class HomeController
{
	@GetMapping("/")
	public String display(Model model)
	{

		return "index";
	}
}
