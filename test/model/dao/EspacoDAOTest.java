/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.bean.Espaco;
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
public class EspacoDAOTest {
    
    public EspacoDAOTest() {
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
     * Test of inserir method, of class EspacoDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Espaco espaco = null;
        EspacoDAO instance = new EspacoDAO();
        Boolean expResult = null;
        Boolean result = instance.inserir(espaco);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class EspacoDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String nome = "";
        EspacoDAO instance = new EspacoDAO();
        List<Espaco> expResult = null;
        List<Espaco> result = instance.buscar(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLista method, of class EspacoDAO.
     */
    @Test
    public void testBuscarLista() {
        System.out.println("buscarLista");
        List<String> expResult = null;
        List<String> result = EspacoDAO.buscarLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNumeroEspacos method, of class EspacoDAO.
     */
    @Test
    public void testBuscarNumeroEspacos() {
        System.out.println("buscarNumeroEspacos");
        EspacoDAO instance = new EspacoDAO();
        int expResult = 0;
        int result = instance.buscarNumeroEspacos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
