package com.genspringboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genspringboot.project.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
