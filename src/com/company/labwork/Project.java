package com.company.labwork;

import java.util.ArrayList;
import java.util.List;

public class Project {
    public static void main(String[] args) {

    }
}

class Student{
    List<Double> studentGrades;

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
}

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


class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> studentGrades) {
        super(studentGrades);
    }

    @Override
    public double getAverageGrade() {
        double average = super.getAverageGrade();
        return average + (average * 0.1);
    }
}