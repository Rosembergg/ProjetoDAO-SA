/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoDAO.DAO;

import br.com.projetoDAO.model.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author info
 */
public class PessoaDAOTest {
    Pessoa p;

    public PessoaDAOTest() {
        p = new Pessoa("Ilzanete","Maezona");
        
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
     * Test of consulta method, of class PessoaDAO.
     */
    @Test
    public void testConsulta() {
        System.out.println("Query");
        PessoaDAO instance = new PessoaDAO();
        assertTrue(instance.consulta());
    }
    
    @Test
    @Ignore
    public void testInserir(){
        System.out.println("Insert");
        PessoaDAO pd = new PessoaDAO();
        assertTrue(pd.inserir(p));
    }
    
    @Test
    @Ignore
    public void testUpdate(){
        System.out.println("Update");
        PessoaDAO pd = new PessoaDAO();
        p = new Pessoa(2,"João","Açougue");
        assertTrue(pd.update(p));
    }
    @Test
    @Ignore
    public void testDelete(){
        System.out.println("Delete");
        PessoaDAO pd = new PessoaDAO();
        assertTrue(pd.delete(1));
    }

}
