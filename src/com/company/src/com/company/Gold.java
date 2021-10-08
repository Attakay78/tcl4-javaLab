package com.company;

public class Gold extends MembershipType{
    private final int maxTradeLimit = 20;

    public int getMaxTradeLimit() {
        return maxTradeLimit;
    }

    public String getMembershipName(){
        return "Gold";
    }
}
