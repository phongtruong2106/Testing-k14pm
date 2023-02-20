/*
*  created date: Feb 13, 2023
*  author: cgm
*/
package com.gdu;

public interface Expression {

    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    
}
