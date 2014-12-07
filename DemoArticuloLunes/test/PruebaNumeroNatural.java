/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import demoarticulolunes.Negocio.NumeroNatural;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Lidia
 */
public class PruebaNumeroNatural {
    
    public PruebaNumeroNatural() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Prueba poniendo un numero de un dígito
     */
    @Test
    public void CapicuaUnDigito() {
        NumeroNatural numero = new NumeroNatural(1);
        boolean resultado = numero.EsCapicua();
        assertEquals(true, resultado);
    }
    
    @Test
    public void ContarDigitoNumero() {
        NumeroNatural numero = new NumeroNatural(1);
        int resultado = numero.ContadorDeDigitos();
        assertEquals(1, resultado);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}no
}
