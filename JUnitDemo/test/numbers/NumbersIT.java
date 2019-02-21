/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
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
public class NumbersIT {

    private static Scanner scan;
    private static PrintWriter write;
    private static Numbers instance;
    private static ArrayList<Integer> myData;

    public NumbersIT() {
        instance = new Numbers();
    }

    @BeforeClass
    public static void setUpClass() throws FileNotFoundException {
        myData = new ArrayList<Integer>();
        write = new PrintWriter("Output.txt");
    }

    @AfterClass
    public static void tearDownClass() {
        scan.close();
        write.close();

    }

    @Before
    public void setUp() throws FileNotFoundException {
        scan = new Scanner(new File("Input.txt"));
        while (scan.hasNext()) {
            myData.add(scan.nextInt());
        }
        instance.setNumbers(myData);
        System.out.println(instance.getNumbers());
    }

    @After
    public void tearDown() {
       
        //Actual output
        write.print("Actual: ");
        write.println(instance.getNumbers());
        myData.clear();
    }

    /**
     * Test of addByIndex method, of class Numbers.
     */
    @Test
    public void testAddByIndex() {
        System.out.println("addByIndex");
        write.println("addByIndex");
        ArrayList<Integer> expResult = addByIndex();
        ArrayList<Integer> actualResult = instance.addByIndex();
        System.out.println("Expected: "+expResult);
        write.println("Expected: "+expResult);
        assertTrue(expResult.equals(actualResult));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplyByIndex method, of class Numbers.
     */
    @Test
    public void testMultiplyByIndex() {
        System.out.println("multiplyByIndex");
        write.println("multiplyByIndex");
        ArrayList<Integer> expResult = this.multiplyByIndex();
        ArrayList<Integer> result = instance.multiplyByIndex();
        System.out.println("Expected: "+expResult);
        write.println("Expected: "+expResult);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    private ArrayList<Integer> addByIndex() {
        ArrayList<Integer> addList = new ArrayList<>();
        addList.add(10);
        addList.add(21);
        addList.add(32);
        addList.add(43);
        addList.add(54);
        addList.add(65);
        addList.add(76);
        addList.add(87);
        addList.add(98);
        addList.add(109);
        return addList;
    }

    private ArrayList<Integer> multiplyByIndex() {
        ArrayList<Integer> addList = new ArrayList<>();
        addList.add(0);
        addList.add(20);
        addList.add(60);
        addList.add(120);
        addList.add(200);
        addList.add(300);
        addList.add(420);
        addList.add(560);
        addList.add(720);
        addList.add(900);
        return addList;
    }
}
