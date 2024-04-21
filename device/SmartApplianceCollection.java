package device;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmartApplianceCollection {
    private List<SmartAppliance> smartApplianceList;

    public SmartApplianceCollection() {
        smartApplianceList = new ArrayList<>();
    }

    public void addSmartAppliance(SmartAppliance smartAppliance) {
        smartApplianceList.add(smartAppliance);
    }

    public void removeSmartAppliance(SmartAppliance smartAppliance) {
        smartApplianceList.remove(smartAppliance);
    }

    public SmartAppliance searchSmartApplianceByID(int applianceID) {
        for (SmartAppliance smartAppliance : smartApplianceList) {
            if (smartAppliance.ID == applianceID) {
                return smartAppliance;
            }
        }
        return null;
    }

    public void displaySmartAppliances() {
        System.out.println("All Smart Appliances:");
        for (SmartAppliance smartAppliance : smartApplianceList) {
            System.out.println(smartAppliance.toString());
        }
    }

    public void sortSmartAppliancesByID() {
        Collections.sort(smartApplianceList, new Comparator<SmartAppliance>() {
            @Override
            public int compare(SmartAppliance sa1, SmartAppliance sa2) {
                return Integer.compare(sa1.ID, sa2.ID);
            }
        });
    }

    @Override
    public String toString() {
        return "Smart Appliance Collection: " + smartApplianceList.toString();
    }
}
