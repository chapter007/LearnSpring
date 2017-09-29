package com.demo.dao;

import com.demo.domain.Student;

public interface StudentDao {
    int getMatchCount(String sname,String sno);
    Student getStudentById(String sno);
    Student getStudentByName(String sname);
}
