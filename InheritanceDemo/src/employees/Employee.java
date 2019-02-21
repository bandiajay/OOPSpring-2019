/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author ajay
 */
public class Employee {
    private int empID;
    private String name;
    private String ssn;

    public Employee(int empID, String name, String ssn) {
        this.empID = empID;
        this.name = name;
        this.ssn = ssn;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", name=" + name + ", ssn=" + ssn + '}';
    }
    
    
}
