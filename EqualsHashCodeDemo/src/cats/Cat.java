/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

import java.util.Objects;

/**
 *
 * @author ajay
 */
public class Cat {
    private String catName;
    private int catAge;
    private double catPrice;

    public Cat(String catName, int catAge, double catPrice) {
        this.catName = catName;
        this.catAge = catAge;
        this.catPrice = catPrice;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public double getCatPrice() {
        return catPrice;
    }

    public void setCatPrice(double catPrice) {
        this.catPrice = catPrice;
    }

    @Override
    public String toString() {
        return "Cat{" + "catName=" + catName + ", catAge=" + catAge + ", catPrice=" + catPrice + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.catName);
        hash = 29 * hash + this.catAge;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.catPrice) ^ (Double.doubleToLongBits(this.catPrice) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cat other = (Cat) obj;
        if (!Objects.equals(this.catName, other.catName)) {
            return false;
        }
        if (this.catAge != other.catAge) {
            return false;
        }
        if (Double.doubleToLongBits(this.catPrice) != Double.doubleToLongBits(other.catPrice)) {
            return false;
        }
        return true;
    }

   

    
    
    
            
}
