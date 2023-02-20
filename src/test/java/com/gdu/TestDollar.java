/*
*  created date: Feb 06, 2023
*  author: cgm
*/
package com.gdu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestDollar {

    @Test
    void testMultiplication() {

        Money five = Money.dolar(5);

        assertEquals(Money.dolar(10), five.times(2));
        assertEquals(Money.dolar(15), five.times(3));

        Franc fiveF = Money.franc(5);
        assertEquals(Money.franc(10), fiveF.times(2));
        assertEquals(Money.franc(15), fiveF.times(3));

    }

    @Test
    void testSimpleAddtion() {
        Money five = Money.dolar(5);
        Expression sum = five.plus(five);

        Bank bank = new Bank();

        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dolar(10), reduced);

    }

    @Test
    void testCurrency() {

        assertEquals("USD", Money.dolar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());

    }

    @Test
    void testEquality() {

        assertEquals(Money.dolar(5), Money.dolar(5));
        assertNotEquals(Money.dolar(5), Money.dolar(8));

        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(8));

        /// Dollar with Francs

        assertNotEquals(Money.franc(5), Money.dolar(5));

    }

    @Test
    void testPlusReturnSum() {

        Money five = Money.dolar(5);
        Expression result = five.plus(five);

        Sum sum = (Sum) result;

        assertEquals(five, sum.addend);
        assertEquals(five, sum.augend);

    }

    @Test
    void testReduceSum() {

        Expression sum = new Sum(Money.dolar(5), Money.dolar(5));

        // Mockito
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dolar(10), result);

    }

    @Test
    void testReduceMoneyDifferentCurrency() {

        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dolar(1), result);

    }

    @Test
    void testIdentityRate() {

        assertEquals(1, new Bank().rate("USD", "USD"));
        assertEquals(1, new Bank().rate("CHF", "CHF"));

    }

    @Test
    void testMixAddition() {
        Expression fiveBucks = Money.dolar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");

        assertEquals(Money.dolar(10), result);
    }

    @Test
    void testSumPlusMoney() {

        Expression fiveBucks = Money.dolar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Expression sum = new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dolar(15), result);

    }

}
