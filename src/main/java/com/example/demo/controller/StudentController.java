package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.Supervisior;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentRepository studentRepositoryRepository;
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
            List<Student> allStudents = studentRepositoryRepository.findAll();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }
    @GetMapping("/getOneStudent/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id){
        return new ResponseEntity<>(studentRepositoryRepository.findById(id).get(),HttpStatus.OK);
    }
    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentRepositoryRepository.save(student),HttpStatus.OK);
    }
    @PutMapping("/updateStudent/{id}")
    public ResponseEntity updateOneStudent(@PathVariable("id") int id,@RequestBody Student student){
        Student student1=studentRepositoryRepository.findById(student.getStudent_id()).orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));;
        student1.setFirst_name(student.getFirst_name());
        student1.setSecond_name(student.getSecond_name());
        student1.setAge(student.getAge());
        student1.setGroup(student.getGroup());
        student1.setEmail(student.getEmail());
        student1.setPhone_number(student.getPhone_number());
        student1.setAddress(student.getAddress());
        student1.setSupervisior_id(student.getSupervisior_id());
        return new ResponseEntity(studentRepositoryRepository.save(student1),HttpStatus.OK);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int id) {
        studentRepositoryRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
