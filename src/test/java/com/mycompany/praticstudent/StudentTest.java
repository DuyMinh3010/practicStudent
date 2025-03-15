package com.mycompany.praticstudent;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        // Khởi tạo Student với đầy đủ tham số: studentId, name, age
        student = new Student("S12345", "John Doe", 20);
    }

    @Test
    public void testGetStudentId() {
        assertEquals("S12345", student.getStudentId(), "Student ID không đúng!");
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName(), "Tên sinh viên không đúng!");
    }

    @Test
    public void testGetAge() {
        assertEquals(20, student.getAge(), "Tuổi sinh viên không đúng!");
    }

    @Test
    public void testSetAge() {
        student.setAge(25);
        assertEquals(25, student.getAge(), "Tuổi sinh viên không được cập nhật đúng!");
    }

    @Test
    public void testUpdateName() {
        student.updateName("Alice Smith");
        assertEquals("Alice Smith", student.getName(), "Tên sinh viên không được cập nhật đúng!");
    }
}
