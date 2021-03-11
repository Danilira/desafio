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
public class EspacoTest {
    
    public EspacoTest() {
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
     * Test of getNome method, of class Espaco.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Espaco instance = new Espaco();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Espaco.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Espaco instance = new Espaco();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLotacao method, of class Espaco.
     */
    @Test
    public void testGetLotacao() {
        System.out.println("getLotacao");
        Espaco instance = new Espaco();
        int expResult = 0;
        int result = instance.getLotacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLotacao method, of class Espaco.
     */
    @Test
    public void testSetLotacao() {
        System.out.println("setLotacao");
        int lotacao = 0;
        Espaco instance = new Espaco();
        instance.setLotacao(lotacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdEspaco method, of class Espaco.
     */
    @Test
    public void testGetIdEspaco() {
        System.out.println("getIdEspaco");
        Espaco instance = new Espaco();
        int expResult = 0;
        int result = instance.getIdEspaco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEspaco method, of class Espaco.
     */
    @Test
    public void testSetIdEspaco() {
        System.out.println("setIdEspaco");
        int idEspaco = 0;
        Espaco instance = new Espaco();
        instance.setIdEspaco(idEspaco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtapa method, of class Espaco.
     */
    @Test
    public void testGetEtapa() {
        System.out.println("getEtapa");
        Espaco instance = new Espaco();
        String expResult = "";
        String result = instance.getEtapa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtapa method, of class Espaco.
     */
    @Test
    public void testSetEtapa() {
        System.out.println("setEtapa");
        String etapa = "";
        Espaco instance = new Espaco();
        instance.setEtapa(etapa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
