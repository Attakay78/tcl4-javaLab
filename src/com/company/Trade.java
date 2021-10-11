package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

//Trade class
abstract class Trade {
    private final String ID; // trade ID
    private final String symbol; // trade symbol
    private final int quantity; // trade quantity
    private double price; // trade price

    public abstract double calcDividend();
    //trade constructor with all four attributes provided
    Trade(String ID, String symbol, int quantity, double price){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public String getID() {
        return ID;
    }
//    trade constructor with all attributes present except price
//    Trade(String ID, String symbol, int quantity){
//        this.ID = ID;
//        this.symbol = symbol;
//        this.quantity = quantity;
//    }

    //a toString method to print trade info in user readable for
    @Override
    public String toString(){
        return ID + " " + symbol + " " + quantity + " " + price;
    }

    //method to get trade price
    public double getPrice() {
        return price;
    }

    //method to get trade quantity
    public int getQuantity() {
        return quantity;
    }
    //method to set trade quantity
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    //method to set trade price, returns 0 if price is negative
    public double setPrice(double price) throws Exception {
        double returnStatement;
        if(price < 0) {
            //price can not be negative
            throw new Exception("Negative price value not allowed");
        }
        else{
            this.price = price;
            returnStatement = this.price;
        }
        return returnStatement;
    }
}