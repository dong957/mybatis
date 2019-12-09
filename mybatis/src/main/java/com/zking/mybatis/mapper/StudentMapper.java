package com.zking.mybatis.mapper;

import com.zking.mybatis.model.Student;

import java.util.List;

/**
 * @author dong
 * @create 2019-11-1221:28
 */
public interface StudentMapper {
    int add(Student stu);
    int edit(Student stu);
    int del(Student stu);
    Student load(Student stu);
    List<Student> list(Student stu);


}
