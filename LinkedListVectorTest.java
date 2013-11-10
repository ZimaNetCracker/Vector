/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.netcracker.vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author netcracker
 */
public class LinkedListVectorTest {
    
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
     * Test of getCurrent method, of class LinkedListVector.
     */
    @Test
    public void testGetCurrent() {
        System.out.println("getCurrent");
        LinkedListVector instance = null;
        LinkedListVector.ListVector expResult = null;
        LinkedListVector.ListVector result = instance.getCurrent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHead method, of class LinkedListVector.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead");
        LinkedListVector instance = null;
        LinkedListVector.ListVector expResult = null;
        LinkedListVector.ListVector result = instance.getHead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class LinkedListVector.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        LinkedListVector instance = null;
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEl method, of class LinkedListVector.
     */
    @Test
    public void testSetEl() {
        System.out.println("setEl");
        int numEl = 0;
        double el = 0.0;
        LinkedListVector instance = null;
        instance.setEl(numEl, el);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEl method, of class LinkedListVector.
     */
    @Test
    public void testGetEl() {
        System.out.println("getEl");
        int numEl = 0;
        LinkedListVector instance = null;
        double expResult = 0.0;
        double result = instance.getEl(numEl);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEl method, of class LinkedListVector.
     */
    @Test
    public void testAddEl() {
        System.out.println("addEl");
        double value = 0.0;
        LinkedListVector instance = null;
        instance.addEl(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delEl method, of class LinkedListVector.
     */
    @Test
    public void testDelEl() {
        System.out.println("delEl");
        LinkedListVector instance = null;
        instance.delEl();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillArray method, of class LinkedListVector.
     */
    @Test
    public void testFillArray() {
        System.out.println("fillArray");
        double[] vs = null;
        LinkedListVector instance = null;
        instance.fillArray(vs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillClass method, of class LinkedListVector.
     */
    @Test
    public void testFillClass() {
        System.out.println("fillClass");
        Vector vs = null;
        LinkedListVector instance = null;
        instance.fillClass(vs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compare method, of class LinkedListVector.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Vector vcomp = null;
        LinkedListVector instance = null;
        boolean expResult = false;
        boolean result = instance.compare(vcomp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minEl method, of class LinkedListVector.
     */
    @Test
    public void testMinEl() {
        System.out.println("minEl");
        LinkedListVector instance = null;
        double expResult = 0.0;
        double result = instance.minEl();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxEl method, of class LinkedListVector.
     */
    @Test
    public void testMaxEl() {
        System.out.println("maxEl");
        LinkedListVector instance = null;
        double expResult = 0.0;
        double result = instance.maxEl();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LinkedListVector.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedListVector instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class LinkedListVector.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        LinkedListVector instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class LinkedListVector.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        LinkedListVector instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class LinkedListVector.
     */
    @Test
    public void testClone() throws Exception {
        System.out.println("clone");
        LinkedListVector instance = null;
        Object expResult = null;
        Object result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
