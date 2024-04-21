/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Smartcitymodel;

/**
 *
 * @author AYMEN
 */
public class Building {
    public int ID;
    public Type type;
    public int numberOfFloors;
    public int numberOfResidents;
    public String ReType;
    public SmartStreet smartStreet;
    public SmartApartment smartApartment;

    public Building(int ID, Type type, int numberOfFloors, int numberOfResidents, String ReType,
                    SmartStreet smartStreet, SmartApartment smartApartment) {
        this.ID = ID;
        this.type = type;
        this.numberOfFloors = numberOfFloors;
        this.numberOfResidents = numberOfResidents;
        this.ReType = ReType;
        this.smartStreet = smartStreet;
        this.smartApartment = smartApartment;
    }

    public void updateBuilding(int newNumberOfFloors, int newNumberOfResidents, String newReType) {
        
        this.numberOfFloors = newNumberOfFloors;
        this.numberOfResidents = newNumberOfResidents;
        this.ReType = newReType;
    }

    @Override
    public String toString() {
        return "Building ID: " + ID + "\nType: " + type + "\nNumber of Floors: " + numberOfFloors
                + "\nNumber of Residents: " + numberOfResidents + "\nRE Type: " + ReType
                + "\nSmart Street: " + smartStreet.ID
                + "\nSmart Apartment: " + smartApartment.ID;
    }
}
