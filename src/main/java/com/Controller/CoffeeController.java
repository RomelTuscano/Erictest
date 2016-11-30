package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.Interface.IsampleInterface;
import com.repository.CoffeeRepository;

public class CoffeeController implements IsampleInterface {
	
	@Autowired
	CoffeeRepository cfRepo;

	@Override
	public double calculatePrice() {
		cfRepo.findAll();
		return 0;
	}

	@Override
	public void updateamountleft() {
		// TODO Auto-generated method stub
		
	}

}
