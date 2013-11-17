package com.netcracker.vectors;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class VectorsTest {
    
    private int vl = 5;
    private ArrayVector vectorOne = new ArrayVector(vl);
    private ArrayVector vectorTwo = new ArrayVector(vl);
    double vectorTree[] = {1, 3, 5, 7, 9};
    double vectorFour[] = {7, 5, 4, 9, 2};
    double vectorFive[] = {2, 4, 5, 7, 9};

    public VectorsTest() {
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
     * Test of multiplication method, of class Vectors.
     */
    @Test
    public void testMultiplication() {
        System.out.print("\nmultiplication: ");
        vectorOne.fillArray(vectorTree);
        double num = 3.0;
        Vector result = Vectors.multiplication(vectorOne, num);
        for(int i = 0; i < vl; i++) {
            System.out.print(result.getEl(i) + " ");
        }
    }

    /**
     * Test of summ method, of class Vectors.
     */
    @Test
    public void testSumm() {
        System.out.print("\nsumm: ");
        vectorOne.fillArray(vectorTree);
        vectorTwo.fillArray(vectorFour);
        Vector result = Vectors.summ(vectorOne, vectorTwo);
        for(int i = 0; i < vl; i++) {
            System.out.print(result.getEl(i) + " ");
        }
    }

    /**
     * Test of sort method, of class Vectors.
     */
    @Test
    public void testSort() {
        System.out.print("\nsort: ");
        vectorTwo.fillArray(vectorFour);
        Vector result = Vectors.sort(vectorTwo);
        for(int i = 0; i < vl; i++) {
            System.out.print(result.getEl(i) + " ");
        }
    }

    /**
     * Test of random method, of class Vectors.
     */
    @Test
    public void testRandom() {
        System.out.println("random");
        int length = 0;
        Vector expResult = null;
        Vector result = Vectors.random(length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of outputVector method, of class Vectors.
     */
    @Test
    public void testOutputVector() {
        System.out.println("outputVector");
        Vector v = null;
        OutputStream out = null;
        Vectors.outputVector(v, out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inputVector method, of class Vectors.
     */
    @Test
    public void testInputVector() {
        System.out.println("inputVector");
        InputStream in = null;
        Vector expResult = null;
        Vector result = Vectors.inputVector(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeVector method, of class Vectors.
     */
    @Test
    public void testWriteVector() {
        System.out.println("writeVector");
        Vector v = null;
        Writer out = null;
        Vectors.writeVector(v, out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readVector method, of class Vectors.
     */
    @Test
    public void testReadVector() {
        System.out.println("readVector");
        Reader in = null;
        Vector expResult = null;
        Vector result = Vectors.readVector(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}