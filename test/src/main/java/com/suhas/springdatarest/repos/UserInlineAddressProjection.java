package com.suhas.springdatarest.repos;

import java.util.Set;

import org.springframework.data.rest.core.config.Projection;

import com.suhas.springdatarest.entities.Company;
import com.suhas.springdatarest.entities.School;
import com.suhas.springdatarest.entities.User;

@Projection(name = "inlineAddress", types = { User.class })
public interface UserInlineAddressProjection {
	
	
	String getFirstName();
	String getLastName();
	String getEmail();
    Set<School> getSchools();
    Set<Company> getCompanies();
    
	}

