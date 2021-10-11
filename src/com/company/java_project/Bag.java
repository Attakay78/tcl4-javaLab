package com.company.java_project;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    List<T> listOfItems;

    public Bag(List<T> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public void add(T item){
        listOfItems.add(item);
    }

    public void remove(T item){
        listOfItems.remove(item);
    }

    public void clear(){
        for(T item : listOfItems){
            listOfItems.remove(item);
        }
    }
}
