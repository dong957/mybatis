package com.zking.mybatis.service;

import com.zking.mybatis.model.Student;
import com.zking.mybatis.util.PageBean;
import com.zking.mybatis.vo.StudentVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


/**
 * @author dong
 * @create 2019-11-1222:00
 */
/*@RunWith(Arquillian.class)*/


public class StudentServiceImplTest extends  BaseTest{

// @Resource
 @Autowired
private  StudentService studentService;




    @Test
    public void add() {
     Student stu=new Student();
     stu.setName("可从但是");
     stu.setAge(23);

     int add=studentService.add(stu);
     System.out.println(add);
    }

    @Test
    public void load() {
        Student stu=new Student();
        stu.setSid(5);
        Student ss=studentService.load(stu);
        System.out.println(ss);

        ss=studentService.load(stu);
        System.out.println(ss);
    }

    @Test
    public void edit(){
       Student stu=new Student();
       stu.setSid(7);
       stu.setName("东东");
       stu.setAge(1);
       int editRow=studentService.edit(stu);
       System.out.println(editRow);
    }

@Test
    public void testList(){
    StudentVo stu=new StudentVo();
    PageBean pageBean=new PageBean();
    List<Integer> sids=new ArrayList<Integer>();
   /* sids.add(5);
    sids.add(6);
    sids.add(7);
    sids.add(8);*/
 /*  stu.setSids(sids);*/
    pageBean.setPage(1);
    pageBean.setRows(3);

    List<Student> lst=studentService.listPage(stu, pageBean);
   for(Student s:lst){
       System.out.println(s);
   }
}





}
