package com.snailmann.service;

import com.snailmann.po.User;

public interface UserLoginService {
	
	//检查登录
	public User checkLogin(String username, String password) throws Exception;
	public boolean findUser(String username, String userType)throws Exception;
	
}
