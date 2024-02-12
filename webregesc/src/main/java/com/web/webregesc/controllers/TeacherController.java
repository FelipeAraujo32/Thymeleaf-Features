package com.web.webregesc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.webregesc.models.StatusTeacher;
import com.web.webregesc.models.Teacher;
import com.web.webregesc.repository.TeacherRepository;

@Controller
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teachers")
    public ModelAndView index(){
        List<Teacher> teachers = this.teacherRepository.findAll();

        ModelAndView mv = new ModelAndView(("teachers/index"));
        mv.addObject("teachers", teachers);
        return mv;
        
    }
    
    @GetMapping("teacher/new")
    public ModelAndView nnew(){
        ModelAndView mv = new ModelAndView("teachers/new");
        mv.addObject("statusTeacher", StatusTeacher.values());
        return mv;
    }

    @PostMapping("/teachers")
    public String create(Teacher teacher){
        System.out.println();
        System.out.println(teacher);
        System.out.println();
        return "redirect:/teachers";
    }

}
