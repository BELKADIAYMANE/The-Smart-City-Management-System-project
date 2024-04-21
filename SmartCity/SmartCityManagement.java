import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import User.*;
import Smartcitymodel.*;
import device.*;
import Exceptions.*;
import java.util.ArrayList;
import java.util.Iterator;

public class SmartCityManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> userList = new ArrayList<>();
        List<SmartApartment> smartApartmentList = new ArrayList<>();
        List<Report> reportList = new ArrayList<>();

        try {
            System.out.print("Enter User ID: ");
            int userID = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter The First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter The Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter your Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Enter your Account Login: ");
            String login = scanner.nextLine();

            System.out.print("Enter your Account Password: ");
            String password = scanner.nextLine();

            Account account = new Account(login, password);
            User user = new User(userID, firstName, lastName, email, phoneNumber, account);
            System.out.println("User created:\n" + user.toString());

            System.out.print("Enter the Apartment ID: ");
            int apartmentID = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the Floor Number: ");
            int floorNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the Number of Rooms: ");
            int numberOfRooms = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the Size: ");
            double size = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the Sensor ID: ");
            int sensorID = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the Temperature: ");
            String temp = scanner.nextLine();

            System.out.print("Enter the Humidity: ");
            String hum = scanner.nextLine();

            System.out.print("Enter the Motion: ");
            String motion = scanner.nextLine();

            System.out.print("Enter the Micro: ");
            String micro = scanner.nextLine();

            System.out.print("Enter the Temperature Value: ");
            double tempValue = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the Humidity Value: ");
            double humValue = scanner.nextDouble();
            scanner.nextLine();

            SensorNode sensorNode = new SensorNode(sensorID, temp, hum, motion, micro, tempValue, humValue);

            System.out.println("SensorNode created:\n" + sensorNode.toString());

            System.out.print("Enter the Appliance ID: ");
            int applianceID = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the Appliance Type: ");
            String type = scanner.nextLine();

            System.out.print("Enter the Power Consumption: ");
            double powerConsumption = scanner.nextDouble();
            scanner.nextLine();

            if (powerConsumption > 1000) {
                throw new PowerConsumptionExceededException("Power consumption exceeds the limit. Please choose a lower power appliance.");
            } else if (powerConsumption < 0) {
                throw new InvalidInputException("Power consumption should be greater or equal to 0.");
            }

            SmartAppliance smartAppliance = new SmartAppliance(applianceID, type, powerConsumption);

            System.out.println("SmartAppliance created:\n" + smartAppliance.toString());

            SmartApartment smartApartment = new SmartApartment(apartmentID,
                    floorNumber, numberOfRooms, size, user,
                    sensorNode, smartAppliance);


            System.out.println("SmartApartment created:\n" + smartApartment.toString());

            System.out.print("Enter the Report ID: ");
            int reportID = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the Date: ");
            String date = scanner.nextLine();

            System.out.print("Enter the Time: ");
            String time = scanner.nextLine();

            System.out.print("Enter the Content: ");
            String content = scanner.nextLine();

            ReportStatus status = ReportStatus.COMPLETED;
            Report report = new Report(reportID, date, time, content, user, status);
            System.out.println("Report created:\n" + report.toString());
            System.out.println("if you want to add a User press 1");
            boolean exitMenu = false;
            while (!exitMenu) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Add User");
                System.out.println("2. Remove User");
                System.out.println("3. Add Report");
                System.out.println("4. Remove Report");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                       userList.add(user);
                        break;

                    case 2:
                        System.out.print("Enter User ID to remove: ");
                        int userIDToRemove = scanner.nextInt();
                        scanner.nextLine();
                        boolean userRemoved = false;
                        Iterator<User> userIterator = userList.iterator();
                        while (userIterator.hasNext()) {
                            User u = userIterator.next();
                            if (u.ID == userIDToRemove) {
                                userIterator.remove();
                                userRemoved = true;
                                break;
                            }
                        }
                        if (userRemoved) {
                            System.out.println("User with ID " + userIDToRemove + " removed successfully.");
                        } else {
                            System.out.println("User with ID " + userIDToRemove + " not found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter the Report ID: ");
                        reportID = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter the Date: ");
                        date = scanner.nextLine();

                        System.out.print("Enter the Time: ");
                        time = scanner.nextLine();

                        System.out.print("Enter the Content: ");
                        content = scanner.nextLine();

                        status = ReportStatus.COMPLETED;
                        report = new Report(reportID, date, time, content, user, status);
                        System.out.println("Report created:\n" + report.toString());

                        reportList.add(report);
                        break;

                    case 4:
                        System.out.print("Enter Report ID to remove: ");
                        int reportIDToRemove = scanner.nextInt();
                        scanner.nextLine();
                        boolean reportRemoved = false;
                        Iterator<Report> reportIterator = reportList.iterator();
                        while (reportIterator.hasNext()) {
                            Report r = reportIterator.next();
                            if (r.ID == reportIDToRemove) {
                                reportIterator.remove();
                                reportRemoved = true;
                                break;
                            }
                        }
                        if (reportRemoved) {
                            System.out.println("Report with ID " + reportIDToRemove + " removed successfully.");
                        } else {
                            System.out.println("Report with ID " + reportIDToRemove + " not found.");
                        }
                        break;

                    case 5:
                        exitMenu = true;
                        break;
                }
            }

        } catch (PowerConsumptionExceededException e) {
            System.out.println("Power consumption exception: " + e.getMessage());
            e.suggestLowerPowerAppliance();
        } catch (InvalidInputException e) {
            System.out.println("There is an issue in your input: " + e.getMessage());
            e.suggestValidInput();
        } finally {
            scanner.close();
        }

        System.out.println("All Users:");
        for (User user : userList) {
            System.out.println(user.toString());
        }

        System.out.println("All Smart Apartments:");
        for (SmartApartment smartApartment : smartApartmentList) {
            System.out.println(smartApartment.toString());
        }

        System.out.println("All Reports:");
        for (Report report : reportList) {
            System.out.println(report.toString());
        }

        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return Integer.compare(user1.ID, user2.ID);
            }
        });
        System.out.println("All Users sorted by ID:");
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}
