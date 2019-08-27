package com.example.appserver.carsapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

	long trip_id;
    String name;
    
    private Set<Car> cars;
    
    @ManyToMany(mappedBy = "trips")
    public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public long getTrip_id() {
		return trip_id;
	}

	public void setTrip_id(long trip_id) {
		this.trip_id = trip_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Trip() {
		super();
	}

	public Trip(String name) {
		super();
		this.name = name;
		
		
	}



}
