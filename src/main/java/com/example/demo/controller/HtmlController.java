package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.SupervisiorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller()
@RequestMapping("/html")
public class HtmlController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    SupervisiorRepository supervisiorRepository;
    @GetMapping({"","/","/index","/index.html"})
    public String getIndex(Model model){
        model.addAttribute("listOfStudents",studentRepository.findAll());
        model.addAttribute("listOfSupervisiors",supervisiorRepository.findAll());
        return "/index";
    }
    @PostMapping("/createStudent")
    public String createStudent(@ModelAttribute Student student){
    studentRepository.save(student);
    return "redirect:/html/index";
    }
    @PostMapping("/updateStudent")
    public String update(@ModelAttribute Student student){
        studentRepository.deleteById(student.getStudent_id());
        studentRepository.save(student);
        return "redirect:/html/index";
    }
    @GetMapping("/deleteStudent/{student_id}")
    public String delete(@PathVariable("student_id") int id){
        studentRepository.deleteById(id);
        return "redirect:/html/index";
    }

}
