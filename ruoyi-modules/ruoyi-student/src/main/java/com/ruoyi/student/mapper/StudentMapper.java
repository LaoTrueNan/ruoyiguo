package com.ruoyi.student.mapper;

import com.ruoyi.student.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentMapper {
    List<Student> selectStudentList();
    Student selectStudentById(@Param("id") String id);
}
