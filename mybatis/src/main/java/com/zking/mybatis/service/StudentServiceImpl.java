package com.zking.mybatis.service;

import com.zking.mybatis.mapper.StudentMapper;
import com.zking.mybatis.model.Student;
import com.zking.mybatis.util.PageBean;
import com.zking.mybatis.vo.StudentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @create 2019-11-1221:53
 */
@Service
public class StudentServiceImpl  implements StudentService{

    @Resource
    private StudentMapper studentMapper;



    @Override
    public int add(Student stu) {
        return studentMapper.add(stu);
    }

    @Override
    public int edit(Student stu) {
        return studentMapper.edit(stu);
    }

    @Override
    public int del(Student stu) {
        return studentMapper.del(stu);
    }

    @Override
    public Student load(Student stu) {
        return studentMapper.load(stu);
    }

    @Override
    public List<Student> listPage(StudentVo stu, PageBean PageBean){
   /*  if(PageBean!=null && PageBean.isPagination()){
        PageHelper.startPage(PageBean.getPage(),PageBean.getRows());
    }*/
    List<Student> lst=studentMapper.list(stu);
    /* if(PageBean!=null && PageBean.isPagination()){
         PageInfo pageInfo=new PageInfo(lst);
         PageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
     }*/
//        return studentMapper.list(stu);
        return  lst;
    }

}
