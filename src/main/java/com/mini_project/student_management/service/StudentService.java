package com.mini_project.student_management.service;

import java.util.List;

import org.jspecify.annotations.Nullable;

import com.mini_project.student_management.entity.Student;

public interface StudentService {

    List<Student> getAllStudents();

    Student createStudent(Student student);

    @Nullable
    Student getStudentById(Long id);

}
