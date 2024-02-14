package com.web.webregesc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.webregesc.dto.NewtTeacherRequest;
import com.web.webregesc.models.StatusTeacher;
import com.web.webregesc.models.Teacher;
import com.web.webregesc.repository.TeacherRepository;

import jakarta.validation.Valid;

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
    
    @GetMapping("teachers/new")
    public ModelAndView nnew(){
        ModelAndView mv = new ModelAndView("teachers/new");
        mv.addObject("liststatusTeacher", StatusTeacher.values());
        return mv;
    }

    @PostMapping("/teachers")
    public ModelAndView create(@Valid NewtTeacherRequest newtTeacherRequest, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ModelAndView mv = new ModelAndView("teachers/new");
            mv.addObject("liststatusTeacher", StatusTeacher.values());
            return mv;
        }
        else{
            Teacher teacher = newtTeacherRequest.toteacher();
            this.teacherRepository.save(teacher);
            return new ModelAndView("redirect:/teachers");
        }
    }
}
