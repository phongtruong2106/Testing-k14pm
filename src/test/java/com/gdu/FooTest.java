package com.gdu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class FooTest {
    @Test
    public void testGetBar() {
        Foo foo = new Foo();
        String result = foo.getBar();

        

        //Use Casse
        //Scenarior - Kich ban
        //"Foobar"

        assertEquals("Foobar",result);

    

    }
}
