package com.example.studentscreate.service;



public class StudentCreateServiceTest {
/*
    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentCreateService studentCreateService;

    private Student testStudent;

    @BeforeEach
    void setUp() {
        testStudent = new Student();
        testStudent.setName("Test Student");
        testStudent.setEmail("test@example.com");
        testStudent.setAge(20);
    }

    @Test
    void createStudent_Success() {
        // Arrange
        when(studentRepository.existsByEmail(testStudent.getEmail())).thenReturn(false);
        when(studentRepository.save(any(Student.class))).thenReturn(testStudent);

        // Act
        Student createdStudent = studentCreateService.createStudent(testStudent);

        // Assert
        assertNotNull(createdStudent);
        assertEquals(testStudent.getName(), createdStudent.getName());
        assertEquals(testStudent.getEmail(), createdStudent.getEmail());
        assertEquals(testStudent.getAge(), createdStudent.getAge());
        
        verify(studentRepository).existsByEmail(testStudent.getEmail());
        verify(studentRepository).save(testStudent);
    }

    @Test
    void createStudent_EmailExists_ThrowsException() {
        // Arrange
        when(studentRepository.existsByEmail(testStudent.getEmail())).thenReturn(true);

        // Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> studentCreateService.createStudent(testStudent)
        );

        assertEquals("Email already exists", exception.getMessage());
        verify(studentRepository).existsByEmail(testStudent.getEmail());
        verify(studentRepository, never()).save(any(Student.class));
    }

    @Test
    void createStudent_NullStudent_ThrowsException() {
        // Act & Assert
        assertThrows(
            NullPointerException.class,
            () -> studentCreateService.createStudent(null)
        );
        
        verify(studentRepository, never()).existsByEmail(any());
        verify(studentRepository, never()).save(any());
    }*/
} 