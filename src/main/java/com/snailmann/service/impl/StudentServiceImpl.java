package com.snailmann.service.impl;

import com.snailmann.mapper.StudentMapper;
import com.snailmann.po.StudentCustom;
import com.snailmann.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	//查询学生个人信息
	@Override
	public StudentCustom findStudentById(Integer id) throws Exception {
		return studentMapper.findStudentById(id);
	}
	//修改学生个人信息
	@Override
	public void updateStudent(StudentCustom studentCustom) throws Exception {
		studentMapper.updateStudentById(studentCustom);
		
	}
	

}
