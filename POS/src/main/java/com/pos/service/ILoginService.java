package com.pos.service;

import com.pos.entity.Login;

public interface ILoginService {
	
	Login validateLogin(Login login);

}