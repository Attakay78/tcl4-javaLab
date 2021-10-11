package com.company.java_project;

import java.util.ArrayList;

public class BagOfStudents {
    ArrayList<Student> students = new ArrayList<>();

    public BagOfStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void add(Student student){
        students.add(student);
    }


    public void remove(Student student){
        students.remove(student);
    }

    public void clear(){
        for(Student student : students){
            students.remove(student);
        }
    }
}
