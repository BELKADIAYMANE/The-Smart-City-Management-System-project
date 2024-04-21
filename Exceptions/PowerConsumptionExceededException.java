/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author AYMEN
 */
public class PowerConsumptionExceededException extends Exception {
    public PowerConsumptionExceededException(String message) {
        super(message);
    }
    public void suggestLowerPowerAppliance() {
        System.out.println("Please enter  a lower power appliance to avoid exceeding the power consumption limit.");
        
    }
}
