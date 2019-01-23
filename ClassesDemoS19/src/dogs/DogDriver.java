/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author ajay
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog("Loney", "Labrador", 5);
        System.out.println(d1.getDogName());
        d1.setDogName("Puppy");
        System.out.println(d1.getDogName());
        System.out.println(d1.toString());
        System.out.println(d1);
    }
    
}
