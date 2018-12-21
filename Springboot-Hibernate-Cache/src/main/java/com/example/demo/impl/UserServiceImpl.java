package com.example.demo.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;

@Service
public class UserServiceImpl {

	@Autowired
	UserRepository uDAO;
	
	@Transactional
	public boolean saveUser(Person user)
	{
		uDAO.saveAndFlush(user);
        return true;
	}

	public List<Person> findAll() {
		return uDAO.findAll();
	}
	
}
