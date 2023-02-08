/*
*  created date: Feb 06, 2023
*  author: cgm
*/
package com.gdu;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(multiplier * this.amount);
    }

	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return null;
	}

}
