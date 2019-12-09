package com.zking.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author dong
 * @create 2019-11-2719:41
 */
@Controller
public class uploadController {


//    @Value("${uploadDir}")
    private String uploadDir="d:\\images";

    @RequestMapping("/uploadFile")
    public String uploadFile(){
        return "uploadFile";
    }

@RequestMapping("upload")
    public String upload(MultipartFile img) throws Exception{
    String fn=img.getOriginalFilename();
    String  path=uploadDir+ File.separator+fn+System.currentTimeMillis();
    File targetFile=new File(path);
    System.out.println("文件上传"+fn);
    img.transferTo(targetFile);
    return "redirect:/uploadFile";
    }


}
