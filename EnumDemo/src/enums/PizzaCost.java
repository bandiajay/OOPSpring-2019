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
public enum PizzaCost {
    LARGE(10, 2), MEDIUM(7, 1), SMALL(4, 0);
    
    private double price;
    private double discount;

    public double getDiscount() {
        return discount;
    }

    private PizzaCost(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }
    
    public double priceAfterDiscount(){
        price = price-(price*discount/100);
        return price;
    }
    
    
}
