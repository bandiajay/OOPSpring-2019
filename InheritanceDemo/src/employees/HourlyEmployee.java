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
public class HourlyEmployee extends Employee {
    private int hrsWorked;
    private double wageRate;

    public HourlyEmployee(int empID, String name, String ssn, int hrsWorked, double wageRate) {
        super(empID, name, ssn);
        this.hrsWorked = hrsWorked;
        this.wageRate = wageRate;
    }

    public int getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    @Override
    public String toString() {
        return "-"+ hrsWorked+"-"+wageRate+"$"+calcSalary();
    }
    
    public double calcSalary(){
        return hrsWorked*wageRate;               
    }
     
    
}
