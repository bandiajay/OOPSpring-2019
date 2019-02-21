/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.ArrayList;

/**
 *
 * @author ajay
 */
public class Numbers {
    private ArrayList<Integer> numbers;
    
    public Numbers(){
        numbers = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
    
    
    
    /**
     * Each element in an array list will be added 
     * to its index.
     * @return 
     */
    public ArrayList<Integer> addByIndex(){
        for(int indx=0; indx<numbers.size(); indx++){
            int result = numbers.get(indx)+indx;
            numbers.set(indx,result);
        }
        return numbers;
    }
    
    public ArrayList<Integer> multiplyByIndex(){
        for(int indx=0; indx<numbers.size(); indx++){
            int result = numbers.get(indx)*indx;
            numbers.set(indx,result);
        }
        return numbers;
    }
}
