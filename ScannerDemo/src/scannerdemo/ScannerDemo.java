/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerdemo;

import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner object with input from Keyborad
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("I read age as: " + age);

        System.out.println("Enter your name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("I read name as: " + name + name.length());

        System.out.println("Enter the temprature: ");
        double temp = scan.nextDouble();
        System.out.println("I read temprature as: " + temp);

    }

}
