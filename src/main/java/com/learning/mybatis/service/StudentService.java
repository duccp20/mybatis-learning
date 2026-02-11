package com.learning.mybatis.service;


import com.learning.mybatis.entity.Student;
import com.learning.mybatis.entity.StudentMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public List<Student> getAll(){
        return studentMapper.getAll();
    }

    public void addStudent(Student student){
        studentMapper.addStudent(student);
    }

    public Student getById(int id){
        return studentMapper.getById(id);
    }

    public void updateStudent(int id, Student student){
          studentMapper.update(id, student);
    }

    public void deleteById(int id){
        studentMapper.delete(id);
    }
}
