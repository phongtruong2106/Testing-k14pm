/*
*  created date: Feb 01, 2023
*  author: cgm
*/
package com.gdu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testNhanDo() {

        Dollar five = new Dollar(5);
        Dollar result = five.nhan(2);
        assertEquals(10,result.soTien);

        result = five.nhan(3);
        assertEquals(15, result.soTien);
        
    }

    @Test
    void testSoSanhMenhGia() {

        assertEquals(new Dollar(5), new Dollar(5));
        
    }

    

    
    
}
