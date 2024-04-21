/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Smartcitymodel;

/**
 *
 * @author AYMEN
 */
public class ControlRoom {
    public int ID;
    public String gateway;
    public String powerSupply;
    public SmartStreet smartStreet;

    public ControlRoom(int ID, String gateway, String powerSupply, SmartStreet smartStreet) {
        this.ID = ID;
        this.gateway = gateway;
        this.powerSupply = powerSupply;
        this.smartStreet = smartStreet;
    }

    

    public void updateSupply(String newSupply) {
        this.powerSupply = newSupply;
        System.out.println("Power supply is successfully  updated");
    }

    public void updateGateway(String newGateway) {
        this.gateway = newGateway;
        System.out.println("Gateway is successfully updated");
    }

    @Override
    public String toString() {
        return "Control Room ID: " + ID + "\nGateway: " + gateway + "\nPower Supply: " + powerSupply+ "\nSmart Street:"+smartStreet;
    }
}
