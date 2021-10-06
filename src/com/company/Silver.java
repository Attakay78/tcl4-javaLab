package com.company;

public class Silver extends MembershipType{
    private final int maxTradeLimit = 10;
    private final double maxTradeAmount = 10000.0;

    public int getMaxTradeLimit() {
        return maxTradeLimit;
    }

    public double getMaxTradeAmount() {
        return maxTradeAmount;
    }

    public String getMembershipName(){
        return "Silver";
    }
}
