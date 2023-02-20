/*
*  created date: Feb 13, 2023
*  author: cgm
*/
package com.gdu;

import java.util.HashMap;

public class Bank {

    //"USD"  "CHF"
    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source, String toCurrency){
        //fake 
        //hard - codeing
        return source.reduce(this, toCurrency);

    }

    public int rate(String from, String to){
       // return from.equals("CHF") && to.equals("USD")? 2: 1;
       if(from.equals(to)){
        return 1;
       }
       return rateMap.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate){

        rateMap.put(new Pair(from, to), rate);
        
    }
    
}
