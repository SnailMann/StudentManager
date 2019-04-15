package com.snailmann.mapper;

import java.util.List;


import com.snailmann.po.StudentCustom;
import com.snailmann.po.StudentQueryVo;


public interface TeacherMapper {
	
	public List<StudentCustom> findStudentCustomList(StudentQueryVo studentQueryVo)throws Exception;
	
	public StudentCustom selectStudentCustomByPrimaryKey(Integer id);
	
	public int updateStudentCustomByPrimaryKey(StudentCustom record);
	
	public int deleteStudentCustomById(Integer id);
	
	public void insertStudentCustom(StudentCustom studentCustom);
	
}
