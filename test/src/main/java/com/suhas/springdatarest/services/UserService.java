package com.suhas.springdatarest.services;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.suhas.springdatarest.entities.Company;
import com.suhas.springdatarest.entities.School;
import com.suhas.springdatarest.entities.User;
import com.suhas.springdatarest.repos.UserRepository;

@Service
public class UserService {
	
    @Autowired
    protected UserRepository repo;
	
	 public Page<User> getAll(int page, int size) {
	        return repo.findAll(new PageRequest(page, size));
	    }

	    public User getOne(Integer id) throws Exception {
	       
	        User user = repo.findOne(id);
	       
	        Set<Company> companies = user.getCompanies();       
	        for (Company company : companies) {
	        	company.setUser(null);
	        }
	       
	        Set<School> schools = user.getSchools();     
	        for (School school: schools) {
	        	school.setUser(null);
	        }

	        return user;
	    }

}
