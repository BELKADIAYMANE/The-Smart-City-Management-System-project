/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author AYMEN
 */
public class Account {
    public String login;
    private String password;
    

    public Account(String login, String password) {
        this.login = login;
        this.password=password;
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean authenticate(String enteredPassword) {
        return enteredPassword.equals(password);
    }
    @Override

    public String toString() {
        return "Login: " + login + "\npassword:"+password;
    }
    
}
