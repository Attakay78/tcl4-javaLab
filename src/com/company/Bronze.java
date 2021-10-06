package com.company;

public class Bronze extends MembershipType{
    private final int maxTradeLimit = 5;

    public String getMembershipName(){
        return "Bronze";
    }

    public int getMaxTradeLimit() {
        return maxTradeLimit;
    }
}
