package com.company.labwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student frank;

    @BeforeEach
    void setUp() {
        List grades = new ArrayList();

        grades.add(2.6);
        grades.add(5.0);
        grades.add(8.2);
        grades.add(4.1);
        grades.add(2.0);
        frank = new Student(grades);
    }

    @Test
    void checkAverage(){
        assertEquals(4.38, frank.getAverageGrade());
    }
}