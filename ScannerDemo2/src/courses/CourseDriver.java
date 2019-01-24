/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class CourseDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //Scanner object with input from Keyborad
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the course number: ");
        int crsNum = scan.nextInt();
       
        System.out.println("Enter the course name: ");
        scan.nextLine();
        String crsName = scan.nextLine();

        System.out.println("Enter the credit hours: ");
        double hours = scan.nextDouble();
        
        Course c1 = new Course(crsNum, crsName, hours);
        System.out.println(c1);
    }
    
}
