package com.suhas.springdatarest.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suhas.springdatarest.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{
}
