package com.example.appserver.carsapp.da;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appserver.carsapp.domain.Trip;

public interface TripRepository extends JpaRepository<Trip, Long> {

}
