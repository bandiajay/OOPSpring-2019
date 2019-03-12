/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Student> stuList = new ArrayList<>();
        Scanner scan = new Scanner(new File("studentData.txt"));
        while(scan.hasNext()){
            Student s = new Student(scan.nextInt(), scan.next(),
                    scan.next(), scan.nextDouble());
            stuList.add(s);
        }
        
        System.out.println(stuList.size());
        System.out.println("Printing students after reading from file.");
        for(Student s: stuList){
            System.out.println(s);
        }
        
        Collections.sort(stuList);
       System.out.println("Printing students natural order sorting by idNum");
        for(Student s: stuList){
            System.out.println(s);
        }
        
        //Implementing comparator interface
        Collections.sort(stuList, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getLastName().compareTo(s2.getLastName()) == 0){
                    return s1.getFirstName().compareTo(s2.getFirstName());
                }
                else{
                    return s1.getLastName().compareTo(s2.getLastName());
                }
            }
        });
        
        
       System.out.println("*****Printing students by overriding natural order sorting annonmously");
        for(Student s: stuList){
            System.out.println(s);
        }
    
        Collections.sort(stuList, new StudentComp());
            System.out.println("*****Printing students by overriding natural order sorting in a seperate class");
        for(Student s: stuList){
            System.out.println(s);
        }
       
        
        
        Integer x = 10;
        Integer y = 20;
        System.out.println(x.compareTo(y));
        System.out.println(y.compareTo(x));
        System.out.println(y.compareTo(y));
        
    }
    
}
