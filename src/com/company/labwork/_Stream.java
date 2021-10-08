package com.company.labwork;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) throws IOException {
        int counter = 0;
        int count =0;
        List<String> text = new ArrayList<>();
        String st;
        List<Trade> listOfTrades = new ArrayList<>();
        Map<String, Double> mapOfTradesBySymbolAsKey = new HashMap<>();

        //setting file path
        File file = new File("C:\\Users\\User\\IdeaProjects\\Tutorial\\src\\com\\company\\labwork\\Trades.txt");
        BufferedReader br  = new BufferedReader(new FileReader(file)); //Reading file with bufferedReader


        //looping through file line by line
        while ((st = br.readLine()) != null) {
            Scanner s = new Scanner(st).useDelimiter(",");
            //extracting the first 5 fields into a text ArrayList
            while(s.hasNext() && counter !=5){
                text.add(s.next());
                counter ++;
            }

            //Adding text ArrayList to another ArrayList containing all trades
            listOfTrades.add(new Trade(text.get(0), text.get(1), text.get(2), Integer.parseInt(text.get(3)), Double.parseDouble(text.get(4))));
            text.clear(); //reset text array to empty
            counter = 0; //reset counter to zero
        }

        class QuantityComparator implements Comparator<Trade>{
            @Override
            public int compare(Trade trade, Trade t1) {
                return trade.getQuantity() - t1.getQuantity();
            }
        }

        //sorting trade list with timestamp and then quantity
        Collections.sort(listOfTrades, Comparator.comparing(
                Trade::getTimeStamp
        ).thenComparing(Trade::getQuantity));

        //finding all trades with quantity greater than 200
//        listOfTrades.stream().filter(trade -> trade.getQuantity() > 200).forEach(System.out::println);

        //Mapping trade symbols to total trade value(price*quantity) per symbol
        for(Trade trade : listOfTrades){
            if(mapOfTradesBySymbolAsKey.containsKey(trade.getSymbol())){
                mapOfTradesBySymbolAsKey.replace(trade.getSymbol(), mapOfTradesBySymbolAsKey.get(trade.getSymbol()) + (trade.getPrice()*trade.getQuantity()));
            }else{
                mapOfTradesBySymbolAsKey.put(trade.getSymbol(), trade.getPrice()* trade.getQuantity());
            }
        }

        //looping through mapOfTradesBySymbolAsKey to print out key, value
//        mapOfTradesBySymbolAsKey.forEach((k, v) -> System.out.println("Key: "+ k + " ,value: " + v));


        //Optional labwork

        Optional<String> tradeOptional;
        String stringCheck = "PATH";

        for(Trade trade : listOfTrades){
            tradeOptional = Optional.ofNullable(trade.getSymbol());
            if(tradeOptional.isPresent() && tradeOptional.get().equals(stringCheck)){
                count ++;
                break;
            }
        }
        System.out.println(count >= 1 ? "Trade "+stringCheck + " found" : "Trade "+stringCheck + " not found");

    }
}