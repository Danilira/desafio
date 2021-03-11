/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.HashMap;
import java.util.List;
import model.bean.Pessoa;
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
public class PessoaDAOTest {
    
    public PessoaDAOTest() {
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
     * Test of inserir method, of class PessoaDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Pessoa pessoa = null;
        PessoaDAO instance = new PessoaDAO();
        Boolean expResult = null;
        Boolean result = instance.inserir(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class PessoaDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Pessoa p = null;
        PessoaDAO instance = new PessoaDAO();
        List<Pessoa> expResult = null;
        List<Pessoa> result = instance.buscar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNumeroPessoas method, of class PessoaDAO.
     */
    @Test
    public void testBuscarNumeroPessoas() {
        System.out.println("buscarNumeroPessoas");
        PessoaDAO instance = new PessoaDAO();
        int expResult = 0;
        int result = instance.buscarNumeroPessoas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarSalasEtapasUm method, of class PessoaDAO.
     */
    @Test
    public void testBuscarSalasEtapasUm() {
        System.out.println("buscarSalasEtapasUm");
        PessoaDAO instance = new PessoaDAO();
        HashMap<Integer, Integer> expResult = null;
        HashMap<Integer, Integer> result = instance.buscarSalasEtapasUm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarSalasEtapasDois method, of class PessoaDAO.
     */
    @Test
    public void testBuscarSalasEtapasDois() {
        System.out.println("buscarSalasEtapasDois");
        PessoaDAO instance = new PessoaDAO();
        HashMap<Integer, Integer> expResult = null;
        HashMap<Integer, Integer> result = instance.buscarSalasEtapasDois();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
