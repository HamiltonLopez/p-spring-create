package com.example.studentscreate.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class StudentCreateServiceTest {
/*
    @Mock
    private StudentRepository repository;

    private StudentCreateService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        service = new StudentCreateService(repository);
    }

    @Test
    void createStudent_Success() {
        // Arrange
        Student student = new Student("Test Name", "test@email.com", 20);
        when(repository.existsByEmail(anyString())).thenReturn(false);
        when(repository.save(any(Student.class))).thenReturn(student);

        // Act
        Student result = service.createStudent(student);

        // Assert
        assertNotNull(result);
        assertEquals("Test Name", result.getName());
        assertEquals("test@email.com", result.getEmail());
        assertEquals(20, result.getAge());
        verify(repository).existsByEmail(student.getEmail());
        verify(repository).save(student);
    }

    @Test
    void createStudent_EmailExists_ThrowsException() {
        // Arrange
        Student student = new Student("Test Name", "existing@email.com", 20);
        when(repository.existsByEmail(anyString())).thenReturn(true);

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.createStudent(student);
        });

        assertEquals("Email already exists", exception.getMessage());
        verify(repository).existsByEmail(student.getEmail());
        verify(repository, never()).save(any(Student.class));
    }*/
} 