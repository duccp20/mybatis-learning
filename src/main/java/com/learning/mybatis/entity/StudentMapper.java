package com.learning.mybatis.entity;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

        List<Student> getAll();

        Student getById(int id);

        void addStudent(Student student);

        void delete(int id);

        void update(@Param("id") int id,
                        @Param("student") Student student);
}
