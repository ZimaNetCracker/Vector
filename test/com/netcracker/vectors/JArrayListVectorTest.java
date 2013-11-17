package com.netcracker.vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JArrayListVectorTest {

    private JArrayListVector arrayOne = new JArrayListVector();
    private JArrayListVector arrayTwo = new JArrayListVector();
    double arrayFour[] = {1, 3, 5, 7, 9};
    double arraySix[] = {1, 3, 5, 7, 9, 11, 13};

    public JArrayListVectorTest() {
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
     * Test of fillArray method, of class JArrayListVector.
     */
    @Test
    public void testFillArray() {
        System.out.println("fillArray");
        arrayOne.fillArray(arrayFour);
    }

    /**
     * Test of fillClass method, of class JArrayListVector.
     */
    @Test
    public void testFillClass() {
        System.out.println("fillClass");
        arrayOne.fillArray(arrayFour);
        arrayTwo.fillClass(arrayOne);
    }

    /**
     * Test of setEl method, of class JArrayListVector.
     */
    @Test
    public void testSetEl() {
        System.out.println("setEl");
        arrayOne.fillArray(arrayFour);
        int numEl = 3;
        double el = 55.0;
        arrayOne.setEl(numEl, el);
    }

    /**
     * Test of getEl method, of class JArrayListVector.
     */
    @Test
    public void testGetEl() {
        System.out.println("getEl");
        arrayOne.fillArray(arrayFour);
        int numEl = 3;
        double el = 333.0;
        arrayOne.setEl(numEl, el);
        int indx = 3;
        double expResult = 333.0;
        double result = arrayOne.getEl(indx);
        assertEquals(expResult, result, 333.0);
    }

    /**
     * Test of getLength method, of class JArrayListVector.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        arrayOne.fillArray(arrayFour);
        int expResult = 5;
        int result = arrayOne.getLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of compare method, of class JArrayListVector.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        arrayOne.fillArray(arrayFour);
        arrayTwo.fillArray(arrayFour);
        boolean expResult = true;
        boolean result = arrayOne.compare(arrayTwo);
        assertEquals(expResult, result);
    }

    /**
     * Test of minEl method, of class JArrayListVector.
     */
    @Test
    public void testMinEl() {
        System.out.println("minEl");
        arrayOne.fillArray(arrayFour);
        double expResult = 1.0;
        double result = arrayOne.minEl();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of maxEl method, of class JArrayListVector.
     */
    @Test
    public void testMaxEl() {
        System.out.println("maxEl");
        arrayOne.fillArray(arrayFour);
        double expResult = 9.0;
        double result = arrayOne.maxEl();
        assertEquals(expResult, result, 9.0);
    }

    /**
     * Test of toString method, of class JArrayListVector.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        arrayOne.fillArray(arrayFour);
        String expResult = "1.0 3.0 5.0 7.0 9.0 ";
        String result = arrayOne.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class JArrayListVector.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        arrayOne.fillArray(arrayFour);
        Object obj = arrayOne;
        boolean expResult = true;
        boolean result = arrayOne.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class JArrayListVector.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        arrayTwo.fillArray(arraySix);
        int expResult = 1071513600;
        int result = arrayTwo.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of clone method, of class JArrayListVector.
     */
    @Test
    public void testClone() throws Exception {
        System.out.println("clone");
        arrayTwo.fillArray(arraySix);
        Object expResult = arrayTwo;
        Object result = arrayTwo.clone();
        assertEquals(expResult, result);
    }
}