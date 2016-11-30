package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.Interface.IsampleInterface;
import com.repository.WaterRepository;

public class WaterController implements IsampleInterface {
	
	@Autowired
	WaterRepository waRepo;

	@Override
	public double calculatePrice() {
		//waRepo.findAll();
		return 0;
	}

	@Override
	public void updateamountleft() {
		// TODO Auto-generated method stub
		
	}

}
