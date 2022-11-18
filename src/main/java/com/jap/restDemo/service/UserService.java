package com.jap.restDemo.service;

import com.jap.restDemo.domain.Student;
import com.jap.restDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserServices {
    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserService() {
    }

    @Override
    public Student saveUser(Student student) {
        return userRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return (List<Student>) userRepository.findAll();
    }
}
