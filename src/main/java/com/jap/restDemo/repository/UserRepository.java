package com.jap.restDemo.repository;

import com.jap.restDemo.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Student, Integer> {
}
