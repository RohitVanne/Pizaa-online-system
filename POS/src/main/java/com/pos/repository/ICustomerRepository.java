package com.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.entity.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{
	
	Customer findByContactNo(String contactNo);
	Customer findByCustName(String name);

}