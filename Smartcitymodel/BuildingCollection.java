package Smartcitymodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BuildingCollection {
    private List<Building> buildingList;

    public BuildingCollection() {
        buildingList = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildingList.add(building);
    }

    public void removeBuilding(Building building) {
        buildingList.remove(building);
    }

    public Building searchBuildingByID(int buildingID) {
        for (Building building : buildingList) {
            if (building.ID == buildingID) {
                return building;
            }
        }
        return null;
    }

    public void displayBuildings() {
        System.out.println("All Buildings:");
        for (Building building : buildingList) {
            System.out.println(building.toString());
        }
    }

    public void sortBuildingsByID() {
        Collections.sort(buildingList, new Comparator<Building>() {
            @Override
            public int compare(Building b1, Building b2) {
                return Integer.compare(b1.ID, b2.ID);
            }
        });
    }

    @Override
    public String toString() {
        return "Building Collection: " + buildingList.toString();
    }
}
