package com.company.java_project;

import java.util.ArrayList;

class Lecture{
    ArrayList<Student> students = new ArrayList<>();

    public void enter(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    public double getHighestAverageGrade(){
        double maxAverage = 0;
        for(Student student : students){
            maxAverage = maxAverage > student.getAverageGrade()? maxAverage : student.getAverageGrade();
        }
        return maxAverage;
    }
}

