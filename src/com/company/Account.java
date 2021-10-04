package com.company;

//Account class
public class Account {
    private double value = 0; //Account value

    //method to get account value
    public double getValue() {
        return value;
    }
    //method to set account value
    public void setValue(double value) {
        this.value += value;
    }
}
