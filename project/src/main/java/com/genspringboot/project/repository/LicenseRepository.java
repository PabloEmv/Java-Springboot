package com.genspringboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.genspringboot.project.model.License;

public interface LicenseRepository extends JpaRepository<License, Integer>{
    @Query (value = "SELECT * FROM license WHERE clase = ?1", nativeQuery = true)
    List<License> findAllLicenceClase (String clase);
}
