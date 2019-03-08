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
public class NegativeValueException extends RuntimeException {

    public NegativeValueException() {
        super();
    }

    public NegativeValueException(String message) {
        super(message);
    }
    
}
