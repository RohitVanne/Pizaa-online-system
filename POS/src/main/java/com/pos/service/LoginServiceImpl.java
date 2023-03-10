package com.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.entity.Login;
import com.pos.repository.ILoginRepository;

@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	ILoginRepository loginRepo;

	@Override
	public Login validateLogin(Login login) { ;// email, password, role
		// logic to validate user with db credentials
		
		// get existing login details from db
		// save, findAll, findById, deleteById
		
		//loginRepo.findById(null)
		// Get login details from db using email address
		Login dbLogin = loginRepo.findByEmail(login.getEmail());
		if(dbLogin.getPassword().equals(login.getPassword()) && dbLogin.getRole().equals(login.getRole())) {
			return login;
		}
		
		return null;
	}
	

}