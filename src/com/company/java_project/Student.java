package com.company.java_project;

import java.util.List;

public class Student implements Nameable ,HasLevel {
    private String name;
    private final List<Double> studentGrades;
    private Level level;

    public Student(String name, List<Double> studentGrades,Level level) {
        this.name = name;
        this.studentGrades = studentGrades;
        this.level = level;
    }

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public double getAverageGrade(){
        double sum =0;
        for(Double grade : studentGrades){
            sum += grade;
        }

        double average = sum/(double)studentGrades.size();
        return Math.round(average * 100)/100.0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }
}