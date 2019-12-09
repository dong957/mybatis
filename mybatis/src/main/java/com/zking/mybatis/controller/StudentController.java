package com.zking.mybatis.controller;

import com.zking.mybatis.model.Student;
import com.zking.mybatis.service.StudentService;
import com.zking.mybatis.util.PageBean;
import com.zking.mybatis.vo.StudentVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author dong
 * @create 2019-11-2414:26
 */
@Controller
@RequestMapping("/student")
public class StudentController {

@ModelAttribute
    public void getGrades(Model model) {
        System.out.println("********** getGrades");
        List<String> grades = Arrays.asList("一年级", "二年级", "三年级", "四年级", "五年级", "六年级");

        model.addAttribute("grades",grades);


    }
    @RequestMapping("/add")
    public  String add(Model model){
        System.out.println("********************");
            model.addAttribute("students", new Student());

        return "addstu";
    }


    @Resource
    private  StudentService studentService;
   /* @RequestMapping("/save")
    public String save(Student student){
        System.out.println("**********save***********");
        if(student.getSid()!=null){
            studentService.edit(student);
            System.out.println("*******  update");
        }else {
            studentService.add(student);
            System.out.println("*****  add");
        }

        System.out.println(student);
        return "getS";
    }*/
    @RequestMapping("/saveadd")
    public String saveadd(@Validated(Student.Add.class)  @ModelAttribute("students")  Student student, BindingResult bindingResult){
        System.out.println("**********save***********");

           if(bindingResult.hasErrors()){
            return "addstu";
            }
               studentService.add(student);
               System.out.println("*****  add");

            System.out.println(student);
            return "a";
    }

    @RequestMapping("/saveupdate")
    public String saveupdate(@Validated(Student.Edit.class)  @ModelAttribute("students")  Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "updatestu";
        }
            studentService.edit(student);
            System.out.println("*******  update");

            System.out.println(student);
        return "a";
    }

@RequestMapping("/update")
    public  String update(Student student,Model model){
    Student stu= studentService.load(student);
    model.addAttribute("students",stu);
    return "updatestu";
}

    @RequestMapping("/getS")
    public  String stu(StudentVo student,Model model){
        PageBean pageBean=new PageBean();
        List<Student> myl= studentService.listPage(student,pageBean);
        model.addAttribute("students",myl);
        return "a";
    }


}
