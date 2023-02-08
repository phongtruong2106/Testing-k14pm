/*
*  created date: Feb 08, 2023
*  author: cgm
*/
package com.gdu.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class InlineMockitoTest {

    @Test
    void testInlineMock() {

        Map mapMock = mock(Map.class);

        assertEquals(mapMock.size(), 0);

        
    }
    
}
