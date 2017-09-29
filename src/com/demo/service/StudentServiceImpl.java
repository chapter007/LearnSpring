package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean hasMatchStudent(String sname, String sno) {
        return studentDao.getMatchCount(sname, sno)>0;
    }

    @Override
    public Student getStudentById(String sno) {
        return studentDao.getStudentById(sno);
    }

    @Override
    public Student getStudentByName(String sname) {
        return studentDao.getStudentByName(sname);
    }
}
