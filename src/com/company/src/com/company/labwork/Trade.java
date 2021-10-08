package com.company.labwork;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.Date;

public class Trade {
    private String symbol;
    private String date;
    private String timeStamp;
    private int quantity;
    private double price;

    @Override
    public String toString() {
        return "Trade{" +
                "symbol='" + symbol + '\'' +
                ", date='" + date + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public Trade(String symbol, String date, String timeStamp, int quantity, double price) {
        this.symbol = symbol;
        this.date = date;
        this.timeStamp = timeStamp;
        this.quantity = quantity;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDate() {
        return date;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}
