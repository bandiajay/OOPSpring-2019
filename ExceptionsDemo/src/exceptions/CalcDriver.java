/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ajay
 */
public class CalcDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Calculator calc = new Calculator(-2, 0);
            System.out.println("Add: " + calc.add());
            System.out.println("Div: " + calc.div());
            System.out.println("Sub: " + calc.sub());

            System.out.println("Mul: " + calc.mul());
        }
        catch (ArithmeticException e) {
            System.out.println(e+e.getMessage());
        }
        catch(DivisibleByZeroException e){
            System.out.println(e+e.getMessage());
            try{
                System.out.println("I am here!");              
            }
            catch(Exception ex){
                System.out.println("I am in ex");
            }
        }
        catch(NegativeValueException ex){
            System.out.println(ex+ex.getMessage());
        }


    }

}
