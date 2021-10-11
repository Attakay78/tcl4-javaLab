package com.company.java_project;

import java.util.*;
import java.util.stream.Collectors;

public class Register {
    List<? extends Student> listOfStudents;
    Map<Level, List<Student>> mapStudentsToLevel = new HashMap<Level, List<Student>>();
    Level nextLevel = null;
    List<Student> studentsList = new ArrayList<>();

    public Register(List<? extends Student> studentObject) {
        this.listOfStudents = studentObject;
    }

    public List<String> getRegister() {
        return listOfStudents.stream().map(Nameable::getName).collect(Collectors.toList());
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level) {
//        return listOfStudents.stream().filter(student -> student.getLevel().equals(level)).map(student -> student.getName()).collect(Collectors.toList());
        for (Student student : listOfStudents) {
           if(student.getLevel().equals(level)){
               studentsList.add(student);
           }
        }
        mapStudentsToLevel.put(level, studentsList);
        return mapStudentsToLevel;
    }

    public void printReport() {
        Collections.sort(listOfStudents, Comparator.comparing(Student::getLevel));

        for (Student student : listOfStudents) {
            if (student.getLevel().equals(nextLevel)) {
                System.out.println(student.getName());
            } else {
                nextLevel = student.getLevel();
                System.out.println(nextLevel);
                System.out.println(student.getName());
            }
        }
    }

//    come back to refactor
    public void sort(Comparator<Student> student) {

    }

    public Student returnStudent(String name) throws Exception {
        int count = 0;
        for(Student student : listOfStudents){
            if(student.getName().equals(name)){
                return student;
            }
        }
        throw new StudentNotFoundException("Student not found in database");
    }
}
