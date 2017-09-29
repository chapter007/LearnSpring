package com.demo.controller;

import com.demo.domain.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     *
     * @param sno
     * @param model
     * @return
     */
    @RequestMapping(value="/profile.do",method = RequestMethod.GET)
    public String proflie(@RequestParam("sno") String sno, ModelMap model){
        Student student = studentService.getStudentById(sno);
        model.addAttribute("student", student);
        //跳转到用户信息界面
        return "profile";
    }
}
