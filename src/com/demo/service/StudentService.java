package com.demo.service;

import com.demo.domain.Student;


public interface StudentService {
    boolean hasMatchStudent(String sname, String sno);
    Student getStudentById(String sno);
    Student getStudentByName(String sname);
}
