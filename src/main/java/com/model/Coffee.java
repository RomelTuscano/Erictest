package com.model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "Coffee")
public class Coffee implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "Coffee_Id")
	private int Coffee_Id;

	@Column(name = "CoffeeFlavourName")
	private String CoffeeFlavourName;

	/* 0 = small, 1= midium 2 = large */
	@Column(name = "CoffeeSize")
	private int CoffeeSize;
	@Column(name = "CoffeeLeft")
	private double CoffeeLeft;

	@Column(name = "CoffeePrice")
	private double CoffeePrice;
	@Column(name = "isAvaileble")
	private Boolean isAvaileble;

	public int getCoffee_Id() {
		return Coffee_Id;
	}

	public void setCoffee_Id(int coffee_Id) {
		Coffee_Id = coffee_Id;
	}

	public String getCoffeeFlavourName() {
		return CoffeeFlavourName;
	}

	public void setCoffeeFlavourName(String coffeeFlavourName) {
		CoffeeFlavourName = coffeeFlavourName;
	}

	public int getCoffeeSize() {
		return CoffeeSize;
	}

	public void setCoffeeSize(int coffeeSize) {
		CoffeeSize = coffeeSize;
	}

	public double getCoffeeLeft() {
		return CoffeeLeft;
	}

	public void setCoffeeLeft(double coffeeLeft) {
		CoffeeLeft = coffeeLeft;
	}

	public double getCoffeePrice() {
		return CoffeePrice;
	}

	public void setCoffeePrice(double coffeePrice) {
		CoffeePrice = coffeePrice;
	}

	public Boolean getIsAvaileble() {
		return isAvaileble;
	}

	public void setIsAvaileble(Boolean isAvaileble) {
		this.isAvaileble = isAvaileble;
	}

}
