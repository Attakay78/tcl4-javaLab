package com.company.java_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class RegisterTest {
    private Register register;

    @BeforeEach
    public void setup(){
        List<Double> grades = new ArrayList<>();
        grades.add(3.4);
        grades.add(6.7);
        grades.add(2.9);
        grades.add(0.4);
        grades.add(6.9);

        Student richard = new Student("richard", grades, Level.LEVEL_1);
        Student ben = new Student("ben", grades, Level.LEVEL_2);

        register = new Register(Arrays.asList(richard, ben));
    }

    @Test
    public void testGetRegister(){
        List<String> expected = Collections.singletonList(Arrays.asList("richard quaicoe", "ben mensah").toString());
        List<String> actual = Collections.singletonList(register.getRegister().toString());

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintReport(){
        Set<Level> expected = new HashSet<>();
        expected.add(Level.LEVEL_1);
        expected.add(Level.LEVEL_2);
//        Set<Level> actual = register.printReport();

//        assertEquals(expected, actual);
    }

    @Test
    public void testReturnStudent() throws Exception {
//        Student expected = richard;
//        Student actual = register.returnStudent("richard");

        assertThrows(StudentNotFoundException.class,( ) -> register.returnStudent("nam"));
    }
}
