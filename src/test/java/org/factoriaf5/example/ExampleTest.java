package org.factoriaf5.example;

import java.util.ArrayList;
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

    @Test
    public void testFactorialNegativo() {
        int numero = -7;
        assertThrows(IllegalArgumentException.class,() -> {
            example.factorial(numero);
        });
    }

    @Test
    public void testFactorial() {
        int numero = 4;
        Long resultFactorial = 24L;
        Long result = example.factorial(numero);
        assertEquals(resultFactorial, result, "El factorial de 4 debería ser 24");
    }

    @Test
    public void testEsPrimo() {
        int numero = 3;
        boolean resultado = example.esPrimo(numero);
        assertTrue(resultado);

    }

    @Test
    public void testEsPrimoMenorIgualUno() {
    int numero = 1;
    boolean result = example.esPrimo(numero);
    assertFalse(result);

    }

    @Test
    public void testEsPrimoNoEsPrimo() {
        int[] numeros = {1, 2, 3, 4, 5, 16, 17, 18, 19, 20, 29, 30, 97, 100};
        boolean[] resultadosEsperados = {false, true, true, false, true, false, true, false, true, false, true, false, true, false};
        
        for (int i = 0; i < numeros.length; i++) {
            boolean resultado = example.esPrimo(numeros[i]);
            assertEquals(resultadosEsperados[i], resultado, "Error en el número: " + numeros[i]);
        }
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        String resultado = example.mensajeConRetraso();
        long endTime = System.currentTimeMillis();

        assertEquals("Listo después de retraso", resultado);
        
        long duration = endTime - startTime;
        assertTrue(duration >= 5000 && duration < 6000, "El tiempo de ejecución no fue el esperado");
    }
    
    @Test
    public void testConvertirAString() {
        List<Integer> listaEnteros = new ArrayList<>(Arrays.asList(1, 21, 9, 99));
        List<String> listaStringEsperada = new ArrayList<>(Arrays.asList("1", "21", "9", "99"));

        List<String> resultado = example.convertirAString(listaEnteros);

        assertEquals(listaStringEsperada, resultado);
    }

    @Test
    public void testCalcularMedia() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        double resultado = example.calcularMedia(lista);

        assertEquals(3.0, resultado, 0.001);

        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(Collections.emptyList());
        });

    }

    @Test
    public void testConvertirListaAString() {
        List<String> lista = Arrays.asList("mouse", null, "teclado", "monitor");
        String resultado = example.convertirListaAString(lista);
        assertEquals("MOUSE,NULL,TECLADO,MONITOR", resultado);

        List<String> listaVacia = Arrays.asList();
        resultado = example.convertirListaAString(listaVacia);
        assertEquals("", resultado);
    }
    
}
