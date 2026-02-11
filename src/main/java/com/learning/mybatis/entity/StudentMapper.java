package com.learning.mybatis.entity;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("Select * From Student")
    List<Student> getAll();

    @Select("""
            SELECT * FROM STUDENT WHERE id = #{id}
            """)
    Student getById(int id);

    @Insert("""
            Insert into Student (name, email)
            Values (#{name}, #{email})
            """)
    void addStudent(Student student);

    @Delete("Delete from Student where id = #{id}")
    void delete(int id);

    @Update("""
            UPDATE Student s
            SET s.name = #{student.name},
                s.email = #{student.email}
            WHERE s.id = #{id}
            """)
    public void update(@Param("id") int id,
                          @Param("student") Student student);
}
