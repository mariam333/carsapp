package com.example.appserver.carsapp.da;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appserver.carsapp.domain.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}
