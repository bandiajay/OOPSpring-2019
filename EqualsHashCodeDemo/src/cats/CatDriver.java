/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

/**
 *
 * @author ajay
 */
public class CatDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat c1 = new Cat("puppy", 12, 20.99);
        Cat c2 = new Cat("puppy", 121, 20.991);
        Cat c3 = c2;
        Cat c4 = new Cat("tyu", 123, 6789);
        
        System.out.println("== Expecting false: "+(c1==c2));
        System.out.println("equals Expecting true: "+c1.equals(c2));
        
        System.out.println(Integer.toHexString(System.identityHashCode(c1)));
        System.out.println(Integer.toHexString(System.identityHashCode(c2)));
        System.out.println(Integer.toHexString(System.identityHashCode(c3)));
        
        System.out.println("c1 hashcode:"+c1.hashCode());
        System.out.println("c2 hashcode:"+c2.hashCode());
        System.out.println("c3 hashcode:"+c3.hashCode());
        System.out.println("c4 hashcode:"+c4.hashCode());


    }
    
    
}
