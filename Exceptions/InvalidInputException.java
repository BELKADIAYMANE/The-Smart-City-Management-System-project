/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author AYMEN
 */
public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
    public void suggestValidInput() {
        System.out.println("Please provide valid input to continue.");
         }
    
}

