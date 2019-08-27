package com.example.appserver.carsapp.da;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.appserver.carsapp.domain.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
