package com.company;

import java.util.ArrayList;
import java.util.List;

//Account class
public class Account {
    private double value = 0; //Account value
    private Trade newTrade;


    //method to get account value
    public double getValue() {
        return value;
    }

    //method to set account value
    public void setValue(double value) {
        this.value += value;
    }

}
