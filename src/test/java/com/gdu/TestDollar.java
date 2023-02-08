/*
*  created date: Feb 06, 2023
*  author: cgm
*/
package com.gdu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestDollar {

    @Test
    void testMultiplicationDollar() {

        Dolar five = Money.dolar(5);

        assertEquals(Money.dolar(10), five.times(2));
        assertEquals(Money.dolar(15), five.times(3));
        
    }

    

    

    @Test
    void testCurrency() {

        assertEquals("USD", Money.dolar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
        
        
    }





    @Test
    void testMultiplicationFranc() {

        Franc five = new Franc(5);

        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
        
    }



    @Test
    void testEquality() {

        assertEquals(new Dolar(5), new Dolar(5));
        assertNotEquals(new Dolar(5),new Dolar(8));

        assertFalse(new Dolar(5).equals(new Dolar(8)));

        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));

        ///Dollar with Francs

        assertNotEquals(new Franc(5), new Dolar(5));
        
    }

    

    
    
}
