package com.genspringboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.genspringboot.project.model.CarSell;
public interface CarSellRepository extends JpaRepository<CarSell, Integer> {
    
}
