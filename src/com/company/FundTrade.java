package com.company;

import java.util.Date;

class FundTrade extends Trade{
    private double percentage;
    private Date timeDate;

    FundTrade(String ID, String symbol, int quantity, double price, double percentage) {
        super(ID, symbol, quantity, price);
        this.percentage = percentage;
        this.timeDate = new Date();
    }

    public double calcDividend(){
        return this.percentage * this.getPrice();
    }
}
