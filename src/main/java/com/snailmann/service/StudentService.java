package com.snailmann.service;


import com.snailmann.po.StudentCustom;

public interface StudentService {
	
	//根据ID查找学生名单
	public StudentCustom findStudentById(Integer id) throws Exception;
	//修改学生信息
	public void updateStudent(StudentCustom studentCustom) throws Exception;
		
}
