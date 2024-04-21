/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author AYMEN
 */
public class GeneralAdmin extends User {
    public GeneralAdmin(int ID, String firstName, String lastName, String email, String phoneNumber, Account account) {
        super(ID, firstName, lastName, email, phoneNumber, account);
    }

    public void createProfile(int newID, String newFirstName, String newLastName, String newEmail, String newPhoneNumber) {
        ID = newID;
        firstName = newFirstName;
        lastName = newLastName;
        email = newEmail;
        phoneNumber = newPhoneNumber;
    }

    public void updateProfile(String newFirstName, String newLastName, String newEmail, String newPhoneNumber) {
        firstName = newFirstName;
        lastName = newLastName;
        email = newEmail;
        phoneNumber = newPhoneNumber;
    }

    public void deleteProfile() {
        ID = 0;
        firstName = null;
        lastName = null;
        email = null;
        phoneNumber = null;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUser Type: General Admin";
    }
}
