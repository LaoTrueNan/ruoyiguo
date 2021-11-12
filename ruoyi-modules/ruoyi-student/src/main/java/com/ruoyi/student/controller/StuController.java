package com.ruoyi.student.controller;


import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.student.entity.Student;
import com.ruoyi.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController extends BaseController {

    @Autowired
    private StudentService service;

    @RequestMapping("/ghs")
    public String test(){
        return "10239";
    }
    @ResponseBody
    @GetMapping("/stulist")
    public AjaxResult getList(){
        List<Student> students = service.getStuList();
        return AjaxResult.success(students);
    }

    @ResponseBody
    @GetMapping("/getOneStu")
    public Student getStuById(String id){
        if(!id.isEmpty()&&id!=null){
            return service.getStuById(id);
        }
        else{
            return null;
        }
    }
}
