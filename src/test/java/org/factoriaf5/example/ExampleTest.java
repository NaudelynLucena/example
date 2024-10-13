package org.factoriaf5.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    
    private Example example;

    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testSumar(){

        int num1 = 35; // parametros 
        int num2 = 79;

        int result = example.sumar(num1, num2);
        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);

    }

    @Test
    public void testCheckPositivo() {
        int numero = 7;
        boolean result = example.checkPositivo(numero);
        assertTrue(result);

    }

    @Test
    public void testCheckPositivoError() {
        int numero = -9;
        assertThrows(IllegalArgumentException.class,() -> {
            example.checkPositivo(numero);
        });
    }

}