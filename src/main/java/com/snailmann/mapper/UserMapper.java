package com.snailmann.mapper;

import com.snailmann.po.User;

public interface UserMapper {
	//验证用户密码
	public User findUserByName(String username) throws Exception;
	//验证是否存在ID为username,userType为1的学生
	//验证是否存在ID为username,userType为0的教师

	

}
