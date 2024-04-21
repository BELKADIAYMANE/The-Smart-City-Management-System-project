/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Smartcitymodel;

/**
 *
 * @author AYMEN
 */
public class SmartStreet {
    public int ID;
    public String name;
    public double latitude;
    public double longitude;
    private ControlRoom controlRoom;
    private Building building;

    public SmartStreet(int ID, String name, double latitude, double longitude) {
        this.ID = ID;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public ControlRoom getControlRoom() {
        return controlRoom;
    }

    public void setControlRoom(ControlRoom controlRoom) {
        this.controlRoom = controlRoom;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public void updateStreet(int newId, String newName,double newlatitude, double newlongitude ) {
        this.ID = newId;
        this.name = newName;
        this.latitude = newlatitude;
        this.longitude = newlongitude;
    
        
    }
@Override
    public String toString() {
        return "Street ID: " + ID + "\nName: " + name + "\nLatitude: " + latitude + "\nLongitude: " + longitude
            + "\nControl Room: " + controlRoom.ID 
            + "\nBuilding: " + building.ID;
}

    }

