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
public class Dog {
    
    //Declare attributes
    private String dogName;
    private String dogBreed;
    private int dogAge;
    
    /**
     * 
     * @param dogNameIn - this is name
     * @param dogBreedIn
     * @param dogAgeIn 
     */
    public Dog(String dogNameIn, String dogBreedIn, int dogAgeIn){
        dogName = dogNameIn;
        dogBreed = dogBreedIn;
        dogAge = dogAgeIn;
    }
    
    /**
     * 
     * @return 
     */
    public String getDogName(){
        return dogName;
    }
    
    public String getDogBreed(){
        return dogBreed;
    }
    
    public int getDogAge(){
        return dogAge;
    }
    
    public void setDogName(String dogNameIn){
        dogName = dogNameIn;
    }
    
    public void setDogBreed(String dogBreedIn){
        dogBreed = dogBreedIn;
    }
    
    public void setDogAge(int dogAgeIn){
        dogAge = dogAgeIn;
    }
    
    public void incrementDogAge(){
        dogAge = dogAge+ 1;
    }
    
    public String toString(){
        return dogName+" "+dogBreed+" "+dogAge;
    }
}
