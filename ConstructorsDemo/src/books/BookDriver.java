/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author ajay
 */
public class BookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book(123, "Java", 20.00);
        System.out.println(b1.toString());
        System.out.println(b1); 
        //Book b2 = new Book();
        //System.out.println(b2);
   }
    
}
