package com.learning.mybatis.controller;


import com.learning.mybatis.entity.Student;
import com.learning.mybatis.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

    @PostMapping
    public void addStudent (@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student){
         studentService.updateStudent(id, student);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return studentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int  id) {
         studentService.deleteById(id);
    }


}
