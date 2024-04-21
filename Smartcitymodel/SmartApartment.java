package Smartcitymodel;
import User.User;
import device.SensorNode;
import device.SmartAppliance;

public class SmartApartment {
    public int ID;
    public int floorNumber;
    public int numberOfRooms;
    public double size;
    public SensorNode sensorNode;
    public SmartAppliance smartAppliance;
    private User user;

    public SmartApartment(int ID, int floorNumber, int numberOfRooms, double size, User user,
            SensorNode sensorNode, SmartAppliance smartAppliance) {
        this.ID = ID;
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
        this.size = size;
        this.user = user;
        this.sensorNode = sensorNode;
        this.smartAppliance = smartAppliance;
    }

    public void updateApartment(int newID, int newfloorNumber, int newnumberOfRooms, double newsize, User newuser,
            SensorNode newsensorNode, SmartAppliance newsmartAppliance) {
        this.ID = newID;
        this.floorNumber = newfloorNumber;
        this.numberOfRooms = newnumberOfRooms;
        this.size = newsize;
        this.user = newuser;
        this.sensorNode = newsensorNode;
        this.smartAppliance = newsmartAppliance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Apartment ID: " + ID + "\nFloor Number: " + floorNumber + "\nNumber of Rooms: " + numberOfRooms
                + "\nSize: " + size + "\nResident: " + user.firstName + " " + user.lastName
                + "\nSensor Node: " + sensorNode.toString() + "\nSmart Appliance: " + smartAppliance.toString();
    }
}
