package com.example.appserver.carsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.appserver.carsapp.da.CarRepository;
import com.example.appserver.carsapp.da.DriverRepository;
import com.example.appserver.carsapp.da.OwnerRepository;
import com.example.appserver.carsapp.da.TripRepository;
import com.example.appserver.carsapp.domain.Car;
import com.example.appserver.carsapp.domain.CarOfDriver;
import com.example.appserver.carsapp.domain.Driver;
import com.example.appserver.carsapp.domain.Owner;
import com.example.appserver.carsapp.domain.Trip;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class CarsappApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(CarsappApplication.class);
	
    @Autowired
    private CarRepository carrepository;
    
    @Autowired
    private OwnerRepository ownerrepository;
    
    @Autowired
    private TripRepository triprepository;
    
    @Autowired
    private DriverRepository driverrepository;
    
	public static void main(String[] args) {
		SpringApplication.run(CarsappApplication.class, args);
		
	logger.info("hello from carsapp server app");
	
	}
	@Bean
	CommandLineRunner runner(){
	  return args -> {
	    // Place your code here
		  Owner o1=new Owner("Pini","Cohen");
		  Owner o2=new Owner("Doaa","Ziadat");
		  o2.setFirstname("Abdalla");
		  
		  ownerrepository.save(o1);
		  ownerrepository.save(o2);
		  
          Trip trip1 = new Trip("Trip A");
          Trip trip2 = new Trip("Trip B");
          triprepository.save(trip1);
          triprepository.save(trip2);
          
	        Set<Trip> set_cars_1=new HashSet<Trip>();
	        set_cars_1.add(trip1);
	        set_cars_1.add(trip2);
	        
	        Set<Trip> set_cars_2=new HashSet<Trip>();
	        set_cars_2.add(trip2);
	        set_cars_2.add(trip1);
		  
		  
		    Car c1=new Car("Ford", "Mustang", "Red","ADF-1121", 2017, 59000,o1,set_cars_1);
	        Car c2=new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000,o1,set_cars_1);    
	        Car c3=new Car("Toyota", "Prius", "Silver","KKO-0212", 2018, 39000,o1,set_cars_1);
	        
	        carrepository.save(c1);
	        carrepository.save(c2);    
	        carrepository.save(c3);
	        
	    	  Set<CarOfDriver> set_cars_driver= new HashSet<CarOfDriver>();
	    	  set_cars_driver.add(new CarOfDriver(c1, true));
	    	  set_cars_driver.add(new CarOfDriver(c2, true));

	    	  driverrepository.save(
	        		  new Driver("Sara", set_cars_driver)
	        		  );	  
	    	  

	        

	     
	  };
	} 

}
