package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.impl.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl userImpl;
	
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String addUser(@RequestBody Person user) {
    	
    	userImpl.saveUser(new Person(1, "Abhishek","address","city", "zip"));
        return "CREATED";
    }
    
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Person> list() {
    	return userImpl.findAll();
    }
    
    /*
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public boolean List(@RequestBody List<Integer> ids) {
    	
    	uDAO.saveAndFlush(new Person(1, "Abhishek","address","city", "zip"));
        return true;
    }*/
}