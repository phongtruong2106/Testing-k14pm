/*
*  created date: Feb 06, 2023
*  author: cgm
*/
package com.gdu;

public class Money implements Expression {

    protected int amount;
    protected String currency;

    /**
     * @param amount
     * @param currency
     */
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency() {
        return currency;
    };

    @Override
    public boolean equals(Object arg0) {
        Money money = (Money) arg0;
        return this.amount == money.amount
                && this.currency.equals(money.currency);
    }

    public static Dolar dolar(int amount) {
        return new Dolar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public Expression times(int multiplier) {
        return new Money(multiplier * this.amount,  this.currency);
    }

    public Expression plus(Expression addend){

        return new Sum(this, addend);

    }

    @Override
    public Money reduce(Bank bank, String to){
       // int rate = (currency.equals("CHF") && to.equals("USD"))? 2 : 1;

        return new Money(amount/bank.rate(this.currency, to), to);
    }

}
