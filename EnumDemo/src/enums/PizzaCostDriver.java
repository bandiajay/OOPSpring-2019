/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author ajay
 */
public class PizzaCostDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(PizzaCost.LARGE.getPrice());
        
        for(PizzaCost pizza:PizzaCost.values()){
            System.out.println(pizza+ " pizza is of $"+ pizza.getPrice()+" cost."
            +" Price after discount is: "+pizza.priceAfterDiscount());
        }
        
        PizzaCost pizzaValue = PizzaCost.valueOf("SMALL");
        System.out.println(pizzaValue);
        
        boolean equals = pizzaValue == (PizzaCost.LARGE);
        System.out.println(equals);
        //boolean name = PizzaCost.LARGE.equals(PizzaCost.valueOf("ExtraLarge"));
        //System.out.println(name);
            
        
        
        
    }
    
}
