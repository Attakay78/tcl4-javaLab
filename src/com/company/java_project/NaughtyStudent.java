package com.company.java_project;


import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> studentGrades) {
        super(studentGrades);
    }

    @Override
    public double getAverageGrade() {
        double average = super.getAverageGrade();
        return average + (average * 0.1);
    }
}
