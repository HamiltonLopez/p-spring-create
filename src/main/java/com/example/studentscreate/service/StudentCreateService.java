package com.example.studentscreate.service;

import com.example.studentscreate.model.Student;
import com.example.studentscreate.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentCreateService {

    private final StudentRepository repository;

    public StudentCreateService(StudentRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Student createStudent(Student student) {
        if (repository.existsByEmail(student.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }
        return repository.save(student);
    }
} 