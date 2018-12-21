package com.example.demo.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Person;

@Repository
public interface UserRepository extends JpaRepository<Person, Integer>{

}
