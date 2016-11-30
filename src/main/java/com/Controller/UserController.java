package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
@RestController
@RequestMapping
public class UserController {
	@Autowired
	 private CoffeeController coffeecontroller;
	@Autowired
	 private WaterController watercontroller;
	@Autowired
	 private MilkController milkcontroller;
	
	@RequestMapping("/user")
	public String pourCoffee(Model model) {
		
		coffeecontroller.calculatePrice();
		model.addAttribute("Profile", "aaa");
				
		return "/static/test.html";
	}

}
