package com.snailmann.service.impl;

import com.snailmann.mapper.TeacherMapper;
import com.snailmann.po.StudentCustom;
import com.snailmann.po.StudentQueryVo;
import com.snailmann.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper studentMapperCustom;


    @Override
    public List<StudentCustom> findStudentCustomList(StudentQueryVo studentQueryVo) throws Exception {
        return studentMapperCustom.findStudentCustomList(studentQueryVo);
    }


    //查询某个学生信息
    @Override
    public StudentCustom findStudentById(Integer id) throws Exception {
        return studentMapperCustom.selectStudentCustomByPrimaryKey(id);


    }

    //修改学生信息
    @Override
    public void updateStudentCustom(StudentCustom studentCustom) throws Exception {

        studentMapperCustom.updateStudentCustomByPrimaryKey(studentCustom);

    }

    //删除学生信息
    @Override
    public void deleteStudentCustom(Integer id) throws Exception {

        studentMapperCustom.deleteStudentCustomById(id);
    }

    //插入学生信息
    @Override
    public void insertStudentCustom(StudentCustom studentCustom) throws Exception {

        studentMapperCustom.insertStudentCustom(studentCustom);
    }


}
