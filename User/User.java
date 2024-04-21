/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author AYMEN
 */
public class User {
    public int ID;
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
    public Account account;

    public User(int ID, String firstName, String lastName, String email, String phoneNumber, Account account) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this .account=account;
        
    }

    @Override
    public String toString() {
        return "ID: " + ID + "\nfirstName: " + firstName + "\nlastName: " + lastName + "\nEmail: " + email +
                "\nPhone: " + phoneNumber+ "\nAccount:"+account;
    }
}

   



            
	
    


