/*
*  created date: Feb 06, 2023
*  author: cgm
*/
package com.gdu;

public abstract class Money {
    protected int amount;

    protected String currerncy;

    public abstract String currency();

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object arg0) {
        Money money = (Money) arg0;
        return this.amount == money.amount
        && this.getClass().equals(arg0.getClass());
    }

    public static Dolar dolar(int amount){
       return new Dolar(amount);
    }

    public static Franc franc(int amount){
        return new Franc(amount);
    }
}
