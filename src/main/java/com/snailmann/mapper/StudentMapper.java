package com.snailmann.mapper;



import com.snailmann.po.StudentCustom;

public interface StudentMapper {
	//查询学生个人信息
	public StudentCustom findStudentById(Integer id)throws Exception;
	//修改个人信息
	public void updateStudentById(StudentCustom studentCustom)throws Exception;
	

}
