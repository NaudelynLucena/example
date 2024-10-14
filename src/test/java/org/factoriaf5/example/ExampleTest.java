package org.factoriaf5.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

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

    @Test
    public void testContarLetrasA() {
        String cadena = "mariposa";
        int result = 2;

        int letrasA = example.contarLetrasA(cadena);
        assertTrue(result == letrasA);
    }

    @Test
    public void testContieneElemento(){
        List<String> lista = Arrays.asList("azul", "amarillo", "verde", "rojo");
        String elemento = "azul";
        
        boolean resultado = example.contieneElemento(lista, elemento);
        assertTrue(resultado);
    }

    @Test
    public void testNoContieneElemento(){
        List<String> lista = Arrays.asList("azul", "amarillo", "verde", "rojo");
        String sinElemento = "blanco";
        boolean resultadoSinElemento = example.contieneElemento(lista, sinElemento);
        assertFalse(resultadoSinElemento);
    }

    @Test
    public void testRevertirCadena () {
    
    String cadena = "ABCDE";
    String reversCadena = "EDCBA";
    String result = example.revertirCadena(cadena);
    assertEquals(reversCadena, result);
    
    }

}