package com.company;

import java.util.Date;

class BondTrade extends Trade{
    private  double dividend;
    private Date timeDate;

    BondTrade(String ID, String symbol, int quantity, double price, double dividend) {
        super(ID, symbol, quantity, price);
        this.dividend = dividend;
        this.timeDate = new Date();
    }

    public double calcDividend(){
        return this.dividend;
    }

}
