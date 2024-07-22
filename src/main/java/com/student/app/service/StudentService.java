package com.student.app.service;

import com.student.app.entity.Student;

public interface StudentService {

    public Student save(Student student);

    public Student getStudentById(Long id);

}
