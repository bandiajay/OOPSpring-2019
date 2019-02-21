/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class EmployeeDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee(123, "John Baker", "1230987");
        System.out.println(emp1);
        
        HourlyEmployee hrEmp1 = new HourlyEmployee(234, "James Bond", "23454", 12, 10);
        System.out.println(hrEmp1);
        
        //assigning a sub class oject to super class object.
        emp1 = hrEmp1;
        
       // hrEmp1 = emp1; This is an illegal statement.
      Employee emp = new HourlyEmployee(1234, "Katy", "0986", 23, 12);
        System.out.println("----"+emp);

        
        
    }
    
    
            
}
