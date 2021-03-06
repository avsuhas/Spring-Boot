package com.suhas.springdatarest.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.suhas.springdatarest.entities.User;


@RepositoryRestResource(excerptProjection = UserInlineAddressProjection.class)
public interface UserRepository extends PagingAndSortingRepository <User, Integer>{
}
