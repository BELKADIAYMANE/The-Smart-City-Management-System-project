/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package device;

import Smartcitymodel.SmartApartment;
import User.Account;
import Exceptions.InvalidInputException;
import Exceptions.PowerConsumptionExceededException;


public class SmartAppliance {
    public int ID;
    public String type;
    public double powerConsumption;
    ;

    public SmartAppliance(int ID, String type, double powerConsumption ) {
        this.ID = ID;
        this.type = type;
        this.powerConsumption = powerConsumption;
        
    }

    public double calculateConsumptionTime(double consumptionTime, double powerConsumption) throws InvalidInputException {
        if (consumptionTime <= 0 || powerConsumption <= 0) {
            throw new InvalidInputException("Invalid input: Consumption time and power consumption must be positive numbers");
        }
        return consumptionTime * powerConsumption;
    }

    @Override
    public String toString() {
        return "Appliance ID: " + ID + "\nType: " + type + "\nPower Consumption: " + powerConsumption
                 ;
    }
}
