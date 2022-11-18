package com.jap.restDemo.service;

import com.jap.restDemo.domain.Student;

import java.util.List;

public interface IUserServices {
    Student saveUser(Student student);
    List<Student> getAll();
}
