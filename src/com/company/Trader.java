package com.company;

//Trader class
public class Trader {
    private String name; //trader name
    private Account account; //trader account
    private String tradeType; // trade type {"Fund", "Bond"}

    Trader(String name){
        this.name = name;
        this.account = new Account(); //creating a new account for trader
    }
    //method to add trader trade
    public void addTrade(String ID, String symbol, int quantity, double price, String type, double dividend){
        double tradeValue;

        if (type == "Bond") {
            BondTrade trade = new BondTrade(ID, symbol, quantity, price, dividend); //creating a trade for trader
            tradeValue = trade.getPrice() * trade.getQuantity(); // calculate trade value
            this.account.setValue(tradeValue); //setting trader trade value
        }
        else if(type == "Fund"){
            FundTrade trade = new FundTrade(ID, symbol, quantity, price,  dividend); //creating a trade for trader
            tradeValue = trade.getPrice() * trade.getQuantity(); // calculate trade value
            this.account.setValue(tradeValue); //setting trader trade value
        }

    }
}
