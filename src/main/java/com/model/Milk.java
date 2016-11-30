package com.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "Milk")
public class Milk implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "Milk_Id")
	private int Milk_Id;

	@Column(name = "MilkType")
	private String milkType;

	@Column(name = "MilkLeft")
	private double milkLeft;

	@Column(name = "isAvaileble")
	private Boolean isAvaileble;

	@Column(name = "RefiledDate")
	private LocalDate refiledDate;

	public int getMilk_Id() {
		return Milk_Id;
	}

	public void setMilk_Id(int milk_Id) {
		Milk_Id = milk_Id;
	}

	public String getMilkType() {
		return milkType;
	}

	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}

	public double getMilkLeft() {
		return milkLeft;
	}

	public void setMilkLeft(double milkLeft) {
		this.milkLeft = milkLeft;
	}

	public Boolean getIsAvaileble() {
		return isAvaileble;
	}

	public void setIsAvaileble(Boolean isAvaileble) {
		this.isAvaileble = isAvaileble;
	}

	public LocalDate getRefiledDate() {
		return refiledDate;
	}

	public void setRefiledDate(LocalDate refiledDate) {
		this.refiledDate = refiledDate;
	}

}
