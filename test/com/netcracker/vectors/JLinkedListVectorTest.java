package com.netcracker.vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JLinkedListVectorTest {

    private JLinkedListVector listOne = new JLinkedListVector();
    private JLinkedListVector listTwo = new JLinkedListVector();
    double listArray[] = {1, 3, 5, 7, 9};

    public JLinkedListVectorTest() {
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
     * Test of fillArray method, of class JLinkedListVector.
     */
    @Test
    public void testFillArray() {
        System.out.print("fillArray: ");
        listOne.fillArray(listArray);
        listOne.printVector();
    }

    /**
     * Test of fillClass method, of class JLinkedListVector.
     */
    @Test
    public void testFillClass() {
        System.out.print("fillClass: ");
        listOne.fillArray(listArray);
        listTwo.fillClass(listOne);
        listTwo.printVector();
    }

    /**
     * Test of setEl method, of class JLinkedListVector.
     */
    @Test
    public void testSetEl() {
        System.out.print("setEl: ");
        listOne.fillArray(listArray);
        int numEl = 2;
        double el = 222.0;
        listOne.setEl(numEl, el);
        listOne.printVector();
    }

    /**
     * Test of getEl method, of class JLinkedListVector.
     */
    @Test
    public void testGetEl() {
        System.out.print("getEl: ");
        listOne.fillArray(listArray);
        int indx = 3;
        double expResult = 7.0;
        double result = listOne.getEl(indx);
        System.out.println(result);
        assertEquals(expResult, result, 7.0);
    }

    /**
     * Test of getLength method, of class JLinkedListVector.
     */
    @Test
    public void testGetLength() {
        System.out.print("getLength: ");
        listOne.fillArray(listArray);
        int expResult = 5;
        int result = listOne.getLength();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of compare method, of class JLinkedListVector.
     */
    @Test
    public void testCompare() {
        System.out.print("compare: ");
        listOne.fillArray(listArray);
        listTwo.fillClass(listOne);
        boolean expResult = true;
        boolean result = listOne.compare(listTwo);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of minEl method, of class JLinkedListVector.
     */
    @Test
    public void testMinEl() {
        System.out.print("minEl: ");
        listOne.fillArray(listArray);
        double expResult = 1.0;
        double result = listOne.minEl();
        System.out.println(result);
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of maxEl method, of class JLinkedListVector.
     */
    @Test
    public void testMaxEl() {
        System.out.print("maxEl: ");
        listOne.fillArray(listArray);
        double expResult = 9.0;
        double result = listOne.maxEl();
        System.out.println(result);
        assertEquals(expResult, result, 9.0);
    }

    /**
     * Test of toString method, of class JLinkedListVector.
     */
    @Test
    public void testToString() {
        System.out.print("toString: ");
        listOne.fillArray(listArray);
        String expResult = "1.0 3.0 5.0 7.0 9.0 ";
        String result = listOne.toString();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class JLinkedListVector.
     */
    @Test
    public void testEquals() {
        System.out.print("equals: ");
        listOne.fillArray(listArray);
        listTwo.fillClass(listOne);
        Object obj = listOne;
        boolean expResult = true;
        boolean result = listOne.equals(obj);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class JLinkedListVector.
     */
    @Test
    public void testHashCode() {
        System.out.print("hashCode: ");
        listOne.fillArray(listArray);
        int expResult = 1070727168;
        int result = listOne.hashCode();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of clone method, of class JLinkedListVector.
     */
    @Test
    public void testClone() throws Exception {
        System.out.print("clone: ");
        listOne.fillArray(listArray);
        Object expResult = listOne;
        Object result = listOne.clone();
        System.out.println(result);
        assertEquals(expResult, result);
    }
}