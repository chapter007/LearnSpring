package com.demo.controller;

import com.demo.domain.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    private StudentService studentService;

    /**
     * init login form
     * @param model
     * @return
     */
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String initForm(ModelMap model){
        System.out.println("########## init login page.");
        Student student=new Student();
        //绑定账户对象，也就是这个登录表单对象
        model.addAttribute("student", student);
        //指向登录页面
        return "login";
    }

    /**
     * login check
     * @param student
     * @return
     */
    @RequestMapping(value="/loginCheck",method = RequestMethod.POST)
    public String login(@ModelAttribute("student") Student student) {
        Student student2 = studentService.getStudentByName(student.getSname());
        if (student2 != null) {
            return "redirect:profile.do?sno=" + student2.getSno();
        } else {
            return "redirect:login.do";
        }
    }
}
