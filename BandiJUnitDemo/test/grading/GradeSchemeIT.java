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
public class GradeSchemeIT {
    
    public GradeSchemeIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("This will execute before the class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("This will execute after the class");
    }
    
    @Before
    public void setUp() {
        System.out.println("This will execute after the method");
    }
    
    @After
    public void tearDown() {
        System.out.println("This will execute after the method");
    }

    /**
     * Test of getGrade method, of class GradeScheme.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        int score = 87;
        String expResult = "B";
        String result = GradeScheme.getGrade(score);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
