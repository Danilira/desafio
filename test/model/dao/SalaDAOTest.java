/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.bean.Sala;
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
public class SalaDAOTest {
    
    public SalaDAOTest() {
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
     * Test of inserir method, of class SalaDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Sala sala = null;
        SalaDAO instance = new SalaDAO();
        Boolean expResult = null;
        Boolean result = instance.inserir(sala);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class SalaDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String nome = "";
        SalaDAO instance = new SalaDAO();
        List<Sala> expResult = null;
        List<Sala> result = instance.buscar(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLista method, of class SalaDAO.
     */
    @Test
    public void testBuscarLista() {
        System.out.println("buscarLista");
        List<String> expResult = null;
        List<String> result = SalaDAO.buscarLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNumeroSala method, of class SalaDAO.
     */
    @Test
    public void testBuscarNumeroSala() {
        System.out.println("buscarNumeroSala");
        SalaDAO instance = new SalaDAO();
        int expResult = 0;
        int result = instance.buscarNumeroSala();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
