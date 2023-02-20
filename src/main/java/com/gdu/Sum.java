/*
*  created date: Feb 13, 2023
*  author: cgm
*/
package com.gdu;

public class Sum implements Expression {
    Expression augend;
    Expression addend;
    /**
     * @param augend
     * @param addend
     */
    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    } 

    @Override
    //Sum => "USD"
    public Money reduce(Bank bank, String to){
        int amount = this.augend.reduce(bank, to).amount +
this.addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        // TODO Auto-generated method stub
        return null;
    }

    

    
}
