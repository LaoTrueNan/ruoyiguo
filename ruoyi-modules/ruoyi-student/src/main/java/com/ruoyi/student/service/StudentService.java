package com.ruoyi.student.service;

import com.ruoyi.student.entity.Student;
import com.ruoyi.student.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper mapper;

    public List<Student> getStuList(){
        return mapper.selectStudentList();
    }

    public Student getStuById(String id){
        return mapper.selectStudentById(id);
    }
}
