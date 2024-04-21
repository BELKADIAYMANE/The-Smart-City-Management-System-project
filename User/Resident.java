/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author AYMEN
 */
public class Resident extends User {
    public int age;
    public String profession;
    public String address;

    public Resident(int ID, String firstName, String lastName, String email, String phoneNumber, int age,
            String profession, String address, Account account) {
        super(ID, firstName, lastName, email, phoneNumber, account);
        this.age = age;
        this.profession = profession;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + age + "\nProfession: " + profession + "\nAddress: " + address
                + "\nUser Type: Resident";
    }
}
