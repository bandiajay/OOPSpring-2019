/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ajay
 */
public class GradingSchemeIT {
    
    public GradingSchemeIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");

    }
    
    @Before
    public void setUp() {
        System.out.println("Before method");
    }
    
    @After
    public void tearDown() {
        System.out.println("After method");

    }

    /**
     * Test of getGrade method, of class GradingScheme.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        int score = 0;
        String expResult = "F";
        String actualResult = GradingScheme.getGrade(score);
        assertEquals(expResult, actualResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
