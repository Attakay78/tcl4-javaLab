package com.company.java_project;

import java.util.ArrayList;

public class BagOfLectures {
    ArrayList<Lecture> lectures = new ArrayList<>();

    public BagOfLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

    public void add(Lecture lecture){
        lectures.add(lecture);
    }

    public void remove(Lecture lecture){
        lectures.remove(lecture);
    }

    public void clear(){
        for(Lecture lecture : lectures){
            lectures.remove(lecture);
        }
    }
}
