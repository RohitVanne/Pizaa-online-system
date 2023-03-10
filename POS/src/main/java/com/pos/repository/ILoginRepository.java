package com.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.entity.Login;

@Repository
public interface ILoginRepository extends JpaRepository<Login, Integer> {
	
	Login findByEmail(String email);

}