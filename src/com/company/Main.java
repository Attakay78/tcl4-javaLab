package com.company;

import com.company.java_project.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) throws Exception {
        Register register;
        List<Double> grades;
        Student richard;
        Student ben;
        Student mark;

        grades = new ArrayList<>();
        grades.add(3.4);
        grades.add(6.7);
        grades.add(2.9);
        grades.add(0.4);
        grades.add(6.9);

        richard = new Student("richard", grades, Level.LEVEL_1);
        ben = new Student("ben", grades, Level.LEVEL_2);
        mark = new Student("mark",grades, Level.LEVEL_2);

        register = new Register(Arrays.asList(richard, ben, mark));

        Student ama = new NaughtyStudent(grades);

        Register reg1 = new Register(Arrays.asList(ama));

        System.out.println(register.returnStudent("richard"));
    }
}
