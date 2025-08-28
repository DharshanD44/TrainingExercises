package com.sampleproject.api.Service;

import java.util.List;

import com.sampleproject.api.Entity.Student;


public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
}

