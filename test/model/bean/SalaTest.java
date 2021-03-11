/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class SalaTest {
    
    public SalaTest() {
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
     * Test of getNome method, of class Sala.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Sala instance = new Sala();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Sala.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Sala instance = new Sala();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLotacao method, of class Sala.
     */
    @Test
    public void testGetLotacao() {
        System.out.println("getLotacao");
        Sala instance = new Sala();
        int expResult = 0;
        int result = instance.getLotacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLotacao method, of class Sala.
     */
    @Test
    public void testSetLotacao() {
        System.out.println("setLotacao");
        int lotacao = 0;
        Sala instance = new Sala();
        instance.setLotacao(lotacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdSala method, of class Sala.
     */
    @Test
    public void testGetIdSala() {
        System.out.println("getIdSala");
        Sala instance = new Sala();
        int expResult = 0;
        int result = instance.getIdSala();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSala method, of class Sala.
     */
    @Test
    public void testSetIdSala() {
        System.out.println("setIdSala");
        int idSala = 0;
        Sala instance = new Sala();
        instance.setIdSala(idSala);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtapa method, of class Sala.
     */
    @Test
    public void testGetEtapa() {
        System.out.println("getEtapa");
        Sala instance = new Sala();
        String expResult = "";
        String result = instance.getEtapa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtapa method, of class Sala.
     */
    @Test
    public void testSetEtapa() {
        System.out.println("setEtapa");
        String etapa = "";
        Sala instance = new Sala();
        instance.setEtapa(etapa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
