package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repos.CarRepository;
import com.example.demo.repos.DriverRepository;
import com.example.demo.repos.PaymentRepository;
import com.example.demo.repos.UsersRepository;

@Controller
public class WelcomeController {
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private UsersRepository userrepo;
	
	@Autowired
	private DriverRepository driverrepo;
	
	@Autowired
	private CarRepository carrepo;
	

	@Autowired
	private PaymentRepository paymentrepo;
	
	
	@GetMapping("/")
	public ModelAndView intit() {
		
		mdlView.setViewName("index");
		mdlView.addObject("mainHeading","ABC Car Rental");
		return mdlView;
	}

}
