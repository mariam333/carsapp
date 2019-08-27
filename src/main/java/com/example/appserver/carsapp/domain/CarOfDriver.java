package com.example.appserver.carsapp.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class CarOfDriver implements Serializable{

	@Id
    @ManyToOne
    @JoinColumn
	Car car;
	
	
	@Id
    @ManyToOne
    @JoinColumn
	Driver driver;
	
	
	boolean isMain;
	
	
	
	
	public CarOfDriver(Car car, boolean isMain) {
		super();
		this.car = car;
		this.isMain = isMain;
	}


	public CarOfDriver() {
		super();
	}
	
	
	public boolean isMain() {
		return isMain;
	}


	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}


	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}
