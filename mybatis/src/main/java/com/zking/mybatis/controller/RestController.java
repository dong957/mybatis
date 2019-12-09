package com.zking.mybatis.controller;

import com.zking.mybatis.model.Student;
import com.zking.mybatis.service.StudentService;
import com.zking.mybatis.util.DataProtocol;
import com.zking.mybatis.util.PageBean;
import com.zking.mybatis.vo.StudentVo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dong
 * @create 2019-11-3010:39
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {


    @Resource
    private StudentService studentService;

    @RequestMapping("/load")
    public Object loadStu(StudentVo student) {
        PageBean pageBean = new PageBean();
        List<Student> myl = studentService.listPage(student, pageBean);
        DataProtocol data=new DataProtocol();
        data.setCode(DataProtocol.success);
        data.setData(myl);
        return data;

    }

    @RequestMapping("/addStu")
    public Object addStu(@Validated(Student.Add.class) Student student, BindingResult bindingResult) {
        DataProtocol obj=new DataProtocol();
        if(bindingResult.hasErrors()){
            Map<String,String> errors=new HashMap<>();
            List<FieldError> fieldErrors=bindingResult.getFieldErrors();
            for(FieldError error:fieldErrors){
                errors.put(error.getField(),error.getDefaultMessage());
            }
            obj.setCode(DataProtocol.fail);
            obj.setErrors(errors);
        }else{
            obj.setCode(DataProtocol.success);
            obj.setMessage("操作成功");
        }


        return obj;
    }







    @RequiresPermissions("bookmanager:book:query")
    @RequestMapping("/bookmanager/book/query")
    public Object queryBooks(){
        Map<String,String> book=new HashMap<>();
        book.put("id","10001");
        book.put("bookName","几次都是");
        book.put("price","120");
        DataProtocol data=new DataProtocol();
        data.setData(book);
        return data;

    }

    @RequiresPermissions("bookmanager:book:add")
    @RequestMapping("/bookmanager/book/add")
    public Object addBooks(){

        DataProtocol data=new DataProtocol();
        data.setMessage("操作成功");
        return data;

    }

    @RequiresPermissions("bookmanager:book:edit")
    @RequestMapping("/bookmanager/book/edit")
    public Object editBooks(){

        DataProtocol data=new DataProtocol();
        data.setMessage("操作成功");
        return data;

    }


    @RequiresPermissions("bookmanager:book:del")
    @RequestMapping("/bookmanager/book/del")
    public Object delBooks(){

        DataProtocol data=new DataProtocol();
        data.setMessage("操作成功");
        return data;

    }





















}