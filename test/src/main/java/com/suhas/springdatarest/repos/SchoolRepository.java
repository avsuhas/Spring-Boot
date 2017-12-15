package com.suhas.springdatarest.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suhas.springdatarest.entities.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer>{
}
