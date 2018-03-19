/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entronos.sudoku;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author tunmi
 */
public class SudokuNGTest {
    
    public SudokuNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of inicializar method, of class Sudoku.
     */
    @Test
    public void testInicializar() {
        System.out.println("inicializar");
        Sudoku instance = new Sudoku();
        instance.inicializar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Sudoku.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sudoku instance = new Sudoku();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarElemento method, of class Sudoku.
     */
    @Test
    public void testModificarElemento() throws Exception {
        System.out.println("modificarElemento");
        int fila = 0;
        int columna = 0;
        int elemento = 0;
        Sudoku instance = new Sudoku();
        instance.modificarElemento(fila, columna, elemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciarElemento method, of class Sudoku.
     */
    @Test
    public void testVaciarElemento() {
        System.out.println("vaciarElemento");
        int fila = 0;
        int columna = 0;
        Sudoku instance = new Sudoku();
        instance.vaciarElemento(fila, columna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
