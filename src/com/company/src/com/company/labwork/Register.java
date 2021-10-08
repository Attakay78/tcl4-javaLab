package com.company.labwork;

import java.util.List;
import java.util.stream.Collectors;

public class Register {
    List<Nameable> listOfNameable;

    public Register(List nameable) {
        this.listOfNameable = nameable;
    }

    public List<String> getRegister(){
        return listOfNameable.stream().map(name -> name.getName()).collect(Collectors.toList());
    }
}
