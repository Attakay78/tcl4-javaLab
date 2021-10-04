package com.company;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType;
    private int points;
    private int numberOfTrades;

    Client(){
        this.points = 0;
        this.numberOfTrades = 0;
    }

    public int getNumberOfTrades() {
        return numberOfTrades;
    }

    public void assignMembershipStatus(){
        if(points < 10){
            Bronze bronze = new Bronze();
        }else if(points >= 10 && points <=19){
            Silver silver = new Silver();
        }
        else if(points >= 20){
            Gold gold = new Gold();
        }
    }

    public void addTrade(Trade trade){
        //do something
    }

    public void canTrade(){

    }

}
