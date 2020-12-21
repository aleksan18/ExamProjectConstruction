package com.example.demo.controller;

import com.example.demo.model.Supervisior;
import com.example.demo.repository.SupervisiorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api")
public class SupervisiorController {
    @Autowired
    SupervisiorRepository supervisiorRepository;
    @GetMapping("/find/")
    public ResponseEntity<List<Supervisior>>getAllSupervisiors(@RequestParam(required = false)String id){
        return new ResponseEntity<>(supervisiorRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/getOneSupervisior/{id}")
    public ResponseEntity<Supervisior> getSupervisior(@PathVariable("id") int id){
        Supervisior supervisior= supervisiorRepository.findById(id).get();
        return new ResponseEntity<>(supervisior,HttpStatus.OK);
    }
    @PostMapping("/createSupervisior")
    public ResponseEntity<Supervisior> create(@RequestBody Supervisior supervisior){
    return new ResponseEntity<>(supervisiorRepository.save(supervisior),HttpStatus.OK);
    }
    @PutMapping("/updateSupervisior/{id}")
    public ResponseEntity updateOne(@PathVariable("id") int id,@RequestBody Supervisior supervisior){
       Supervisior supervisior1=supervisiorRepository.findById(id)
               .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));
        supervisior1.setFirst_name(supervisior.getFirst_name());
        supervisior1.setSecond_name(supervisior.getSecond_name());
        supervisior1.setEmail(supervisior.getEmail());
        supervisior1.setPhone_number(supervisior.getPhone_number());
        supervisior1.setAddress(supervisior.getAddress());
        supervisiorRepository.save(supervisior1);
        return new ResponseEntity(HttpStatus.OK);
    }
    @DeleteMapping("/deleteSupervisior/{id}")
    public ResponseEntity delete(@PathVariable("id") int id) {
        supervisiorRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
