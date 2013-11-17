package com.netcracker.vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayVectorTest {

    private int vl = 5;
    private int vlTwo = 7;
    private ArrayVector arrayOne = new ArrayVector(vl);
    private ArrayVector arrayFive = new ArrayVector(vlTwo);
    private ArrayVector arraySeven = new ArrayVector(vl);
    double arrayFour[] = {1, 3, 5, 7, 9};
    double arraySix[] = {1, 3, 5, 7, 9, 11, 13};

    public ArrayVectorTest() {
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
     * Test of fillArray method, of class ArrayVector.
     */
    @Test
    public void testFillArray() {
        System.out.println("fillArray");
        arrayOne.fillArray(arrayFour);
    }

    /**
     * Test of setEl method, of class ArrayVector.
     */
    @Test
    public void testSetEl() {
        System.out.println("setEl");
        int numEl = 2;
        double el = 7.0;
        arrayOne.setEl(numEl, el);
    }

    /**
     * Test of getEl method, of class ArrayVector.
     */
    @Test
    public void testGetEl() {
        int numEl = 2;
        double el = 7.0;
        arrayOne.setEl(numEl, el);
        System.out.println("getEl");
        int indx = 2;
        double expResult = 7.0;
        double result = arrayOne.getEl(indx);
        assertEquals(expResult, result, 7.0);
    }

    /**
     * Test of getLength method, of class ArrayVector.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        int expResult = 5;
        int result = arrayOne.getLength();
        assertEquals(expResult, result, 5);
    }

    /**
     * Test of fillClass method, of class ArrayVector.
     */
    @Test
    public void testFillClass() {
        System.out.print("fillClass: ");
        ArrayVector arrayTwo = new ArrayVector(vl);
        ArrayVector arrayTree = new ArrayVector(vl);
        arrayTwo.fillArray(arrayFour);
        arrayTree.fillClass(arrayTwo);
        arrayTree.printVector();
    }

    /**
     * Test of compare method, of class ArrayVector.
     */
    @Test
    public void testCompare() {
        System.out.print("compare: ");
        arrayOne.fillArray(arrayFour);
        arrayFive.fillArray(arraySix);
        arraySeven.fillArray(arrayFour);
        boolean result = arrayOne.compare(arrayFive);
        System.out.println(result);
        System.out.print("compare: ");
        boolean resultTwo = arrayOne.compare(arraySeven);
        System.out.println(resultTwo);
    }

    /**
     * Test of minEl method, of class ArrayVector.
     */
    @Test
    public void testMinEl() {
        System.out.print("minEl: ");
        arrayOne.fillArray(arrayFour);
        double expResult = 1;
        double result = arrayOne.minEl();
        assertEquals(expResult, result, 1.0);
        System.out.println(result);
    }

    /**
     * Test of maxEl method, of class ArrayVector.
     */
    @Test
    public void testMaxEl() {
        System.out.print("maxEl: ");
        arrayOne.fillArray(arrayFour);
        double expResult = 9.0;
        double result = arrayOne.maxEl();
        assertEquals(expResult, result, 9.0);
        System.out.println(result);
    }

    /**
     * Test of toString method, of class ArrayVector.
     */
    @Test
    public void testToString() {
        System.out.print("toString: ");
        arrayOne.fillArray(arrayFour);
        String expResult = "1.0 3.0 5.0 7.0 9.0 ";
        String result = arrayOne.toString();
        assertEquals(expResult, result);
        System.out.println(result);
    }

    /**
     * Test of equals method, of class ArrayVector.
     */
    @Test
    public void testEquals() {
        System.out.print("equals: ");
        arrayOne.fillArray(arrayFour);
        Object obj = arrayOne;
        boolean expResult = true;
        boolean result = arrayOne.equals(obj);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    /**
     * Test of hashCode method, of class ArrayVector.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        arrayOne.fillArray(arrayFour);
        int expResult = 1070727168;
        int result = arrayOne.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of clone method, of class ArrayVector.
     */
    @Test
    public void testClone() throws Exception {
        System.out.println("clone");
        arrayOne.fillArray(arrayFour);
        Object expResult = arrayOne;
        Object result = arrayOne.clone();
        assertEquals(expResult, result);
    }
}