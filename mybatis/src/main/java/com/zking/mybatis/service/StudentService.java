package com.zking.mybatis.service;

import com.zking.mybatis.model.Student;
import com.zking.mybatis.util.PageBean;
import com.zking.mybatis.vo.StudentVo;

import java.util.List;

/**
 * @author dong
 * @create 2019-11-1221:51
 */
public interface StudentService {

    int add(Student stu);
    int edit(Student stu);
    int del(Student stu);
    Student load(Student stu);
    List<Student> listPage(StudentVo stu, PageBean PageBean);


}
