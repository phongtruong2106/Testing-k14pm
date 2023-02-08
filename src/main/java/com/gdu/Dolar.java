package com.gdu;

/*
*  created date: Feb 06, 2023
*  author: cgm
*/
public class Dolar extends Money {

    public Dolar(int amount) {

        super();
        

    }

    public  Money times(int multiplier) {
        return new Dolar(amount * multiplier);

    }

    @Override
    public String currency() {
        // TODO Auto-generated method stub
        return null;
    }

}
