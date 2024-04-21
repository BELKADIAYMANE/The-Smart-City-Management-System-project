package Smartcitymodel;

import java.util.ArrayList;
import java.util.List;

public class SmartApartmentCollection {
    private List<SmartApartment> smartApartmentList;

    public SmartApartmentCollection() {
        smartApartmentList = new ArrayList<>();
    }

    public void addSmartApartment(SmartApartment smartApartment) {
        smartApartmentList.add(smartApartment);
    }

    public void removeSmartApartment(SmartApartment smartApartment) {
        smartApartmentList.remove(smartApartment);
    }

    public SmartApartment searchSmartApartmentByID(int apartmentID) {
        for (SmartApartment smartApartment : smartApartmentList) {
            if (smartApartment.ID == apartmentID) {
                return smartApartment;
            }
        }
        return null;
    }

    public void displaySmartApartments() {
        System.out.println("All Smart Apartments:");
        for (SmartApartment smartApartment : smartApartmentList) {
            System.out.println(smartApartment.toString());
        }
    }

    @Override
    public String toString() {
        return "Smart Apartment Collection: " + smartApartmentList.toString();
    }
}
