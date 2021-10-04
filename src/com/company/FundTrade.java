package com.company;

import java.util.Date;

class FundTrade extends Trade{
    private double dividend;
    private Date timeDate;

    FundTrade(String ID, String symbol, int quantity, double price, double dividend) {
        super(ID, symbol, quantity, price);
        this.dividend = dividend;
        this.timeDate = new Date();
    }

    public double calcDividend(){
        this.dividend = 0.05 * this.getPrice();
        return this.dividend;
    }
}
