package testContarPalabra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import contarPalabra.ContarPalabra;

class testContarPalabra {

	@Test
    public void testContarPalabras() {
        assertEquals(2, ContarPalabra.contarPalabras("Hola buenas"));
        assertEquals(0, ContarPalabra.contarPalabras(""));
        assertEquals(0, ContarPalabra.contarPalabras(null));
        assertEquals(3, ContarPalabra.contarPalabras("  Hola   buenas  mundo"));
    }

    @Test
    public void testContarLetrasDiferentes() {
        assertEquals(9, ContarPalabra.contarLetrasDiferentes("Hola buenas"));
        assertEquals(0, ContarPalabra.contarLetrasDiferentes(""));
        assertEquals(0, ContarPalabra.contarLetrasDiferentes(null));
        assertEquals(6, ContarPalabra.contarLetrasDiferentes("abcdef"));
    }

    @Test
    public void testContarFrecuenciaPalabras() {
        assertEquals(Map.of("hola", 2, "adios", 1), ContarPalabra.contarFrecuenciaPalabras("hola hola adios"));
    }

    @Test
    public void testContarFrecuenciaLetras() {
        assertEquals(Map.of('h', 3), ContarPalabra.contarFrecuenciaLetras("hhh"));

    }

    @Test
    public void testEsPalindroma() {
        assertTrue(ContarPalabra.esPalindroma("ana"));
        assertTrue(ContarPalabra.esPalindroma("A man a plan a canal Panama"));
        assertFalse(ContarPalabra.esPalindroma("Hola"));
        assertFalse(ContarPalabra.esPalindroma(null));
        assertFalse(ContarPalabra.esPalindroma(""));
    }

}
