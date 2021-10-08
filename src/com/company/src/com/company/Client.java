package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Client {
    private final String firstName;
    private final String lastName;
    private MembershipType membershipType;
    private int points;
    private final List<Trade> listTrades;
    private final Account account;
    private final Map<String, ArrayList<String>> tradeDateTime = new HashMap<>();
    private LocalTime time;
    private LocalDate date;
    private int tradeLimit;

    Client(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = new Account();
        this.points = 0;
        this.membershipType = null;
        this.listTrades = new ArrayList<Trade>();
    }

    public Map<String, ArrayList<String>> getTradeDateTime() {
        return this.tradeDateTime;
    }

    public void assignMembershipStatus(){
        if(this.points>=1 && this.points < 10){
            this.membershipType = new Bronze();
        }else if(points >= 10 && points <=19){
            this.membershipType = new Silver();
        }
        else if(points >= 20){
            this.membershipType = new Gold();
        }
    }

    public int getPoints() {
        return points;
    }

    public void canTrade(Trade trade){
        int checkCondition = 0;

        if(listTrades.isEmpty()){
            listTrades.add(trade);
            tradeDateTime.put(trade.getID(), new ArrayList<String>(Arrays.asList(LocalTime.now().toString(), LocalDate.now().toString())));
            this.points ++;
            assignMembershipStatus();
            this.account.setValue(trade.getPrice()* trade.getQuantity());
        }else{
            for(Trade oldTrade : listTrades){
                if(oldTrade.getID() == trade.getID()){
                    //throw error
                    checkCondition++;
                }else{
                    //
                }
            }
            if(checkCondition >= 1){
                //
            }else{
                listTrades.add(trade);
                tradeDateTime.put(trade.getID(), new ArrayList<String>(Arrays.asList(LocalTime.now().toString(), LocalDate.now().toString())));
                this.account.setValue(trade.getPrice() * trade.getQuantity());
                this.points ++;
                assignMembershipStatus();
            }
        }
    }

    public void addTrade(Trade trade) {
        double value = this.account.getValue() + (trade.getQuantity() * trade.getPrice());
        if (this.listTrades.isEmpty()) {
            canTrade(trade);
        } else {
            switch (this.membershipType.getMembershipName()) {
                case "Bronze":
                case "Gold":
                    if (this.getTrades().size() == this.membershipType.maxTrade) {
                        //throw exception
                    } else {
                        canTrade(trade);
                    }
                    break;
                case "Silver":
                    if (this.getTrades().size() == this.membershipType.maxTrade && value > this.account.getValue()) {
                        //throw exception
                    } else {
                        canTrade(trade);
                    }
                    break;
            }
        }
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public List<Trade> getTrades(){
        return this.listTrades;
    }

    public double getTradeValues(){
        return this.account.getValue();
    }
}
