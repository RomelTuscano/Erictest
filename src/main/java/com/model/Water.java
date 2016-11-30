package com.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Water")
public class Water implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "Water_Id")
	private int water_Id;

	@Column(name = "WaterLeft")
	private double waterLeft;

	@Column(name = "isAvaileble")
	private Boolean isAvaileble;

	@Column(name = "RefiledDate")
	private LocalDate refiledDate;

	public int getWater_Id() {
		return water_Id;
	}

	public void setWater_Id(int water_Id) {
		this.water_Id = water_Id;
	}

	public double getWaterLeft() {
		return waterLeft;
	}

	public void setWaterLeft(double waterLeft) {
		this.waterLeft = waterLeft;
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
