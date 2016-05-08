package com.liujan.controller;

import com.liujan.biz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liujan on 5/7/16.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
       return "home";
    }
}
