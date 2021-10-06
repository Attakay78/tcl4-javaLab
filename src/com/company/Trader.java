package com.company;

import java.util.ArrayList;
import java.util.List;

//Trader class
public class Trader {
    private String name; //trader name
    private Account account; //trader account
    private List<Trade> listTrades;

    Trader(String name){
        this.name = name;
        this.account = new Account(); //creating a new account for trader
        this.listTrades = new ArrayList<Trade>();
    }

    //method to add trader trade
    public void addTrade(Trade trade){
        int checkCondition = 0;

        if(listTrades.isEmpty()){
            listTrades.add(trade);
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
                this.account.setValue(trade.getPrice() * trade.getQuantity());
            }
        }

    }

}
