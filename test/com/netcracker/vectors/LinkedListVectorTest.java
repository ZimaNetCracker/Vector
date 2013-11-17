package com.netcracker.vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListVectorTest {

    private int vl = 5;
    private LinkedListVector listOne = new LinkedListVector(vl);
    private LinkedListVector listSeven = new LinkedListVector(vl);
    double listFour[] = {1, 3, 5, 7, 9};

    public LinkedListVectorTest() {
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
     * Test of fillArray method, of class LinkedListVector.
     */
    @Test
    public void testFillArray() {
        System.out.println("fillArray: ");
        listOne.fillArray(listFour);
        System.out.print("Передаваемый массив: ");
        for (int i = 0; i < listFour.length; i++) {
            System.out.print(listFour[i] + " ");
        }
        System.out.print("\nПолученный результат: ");
        listOne.printVector();
    }

    /**
     * Test of fillClass method, of class LinkedListVector.
     */
    @Test
    public void testFillClass() {
        System.out.println("fillClass: ");
        listOne.fillArray(listFour);
        listSeven.fillClass(listOne);
        System.out.print("Передаваемый массив: ");
        listOne.printVector();
        System.out.print("Полученный результат: ");
        listSeven.printVector();
    }

    /**
     * Test of getLength method, of class LinkedListVector.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        listOne.fillArray(listFour);
        int expResult = vl;
        int result = listOne.getLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEl method, of class LinkedListVector.
     */
    @Test
    public void testSetEl() {
        System.out.println("setEl: ");
        listOne.fillArray(listFour);
        System.out.print("Массив до выполнения метода: ");
        listOne.printVector();
        int numEl = 2;
        double el = 77.0;
        listOne.setEl(numEl, el);
        System.out.print("Массив после выполнения метода: ");
        listOne.printVector();
    }

    /**
     * Test of getEl method, of class LinkedListVector.
     */
    @Test
    public void testGetEl() {
        System.out.println("getEl");
        listOne.fillArray(listFour);
        System.out.print("Массив: ");
        listOne.printVector();
        int numEl = 2;
        double expResult = 5.0;
        double result = listOne.getEl(numEl);
        System.out.println("Элемент №2 = " + result);
        assertEquals(expResult, result, 5.0);
    }

    /**
     * Test of compare method, of class LinkedListVector.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        listOne.fillArray(listFour);
        listSeven.fillClass(listOne);
        boolean expResult = true;
        boolean result = listSeven.compare(listOne);
        assertEquals(expResult, result);
    }

    /**
     * Test of minEl method, of class LinkedListVector.
     */
    @Test
    public void testMinEl() {
        System.out.println("minEl");
        listOne.fillArray(listFour);
        double expResult = 1.0;
        double result = listOne.minEl();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of maxEl method, of class LinkedListVector.
     */
    @Test
    public void testMaxEl() {
        System.out.println("maxEl");
        listOne.fillArray(listFour);
        double expResult = 9.0;
        double result = listOne.maxEl();
        assertEquals(expResult, result, 9.0);
    }

    /**
     * Test of toString method, of class LinkedListVector.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        listOne.fillArray(listFour);
        String expResult = "1.0 3.0 5.0 7.0 9.0 ";
        String result = listOne.toString();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class LinkedListVector.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        listOne.fillArray(listFour);
        listSeven.fillClass(listOne);
        Object obj = listOne;
        boolean expResult = true;
        boolean result = listSeven.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class LinkedListVector.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        listOne.fillArray(listFour);
        int expResult = 2146435072;
        int result = listOne.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of clone method, of class LinkedListVector.
     */
    @Test
    public void testClone() throws Exception {
        System.out.println("clone");
        listOne.fillArray(listFour);
        Object expResult = listOne;
        Object result = listOne.clone();
        assertEquals(expResult, result);
    }
}
