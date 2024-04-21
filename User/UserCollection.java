package User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserCollection {
    private List<User> userList;

    public UserCollection() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public User searchUserByID(int userID) {
        for (User user : userList) {
            if (user.ID == userID) {
                return user;
            }
        }
        return null;
    }

    public void displayUsers() {
        System.out.println("All Users:");
        for (User user : userList) {
            System.out.println("ID: " + user.ID +
                    "\nFirstName: " + user.firstName +
                    "\nLastName: " + user.lastName +
                    "\nEmail: " + user.email +
                    "\nPhoneNumber: " + user.phoneNumber +
                    "\nAccount: " + user.account.toString());
        }
    }

   public void sortUsersByID() {
    Collections.sort(userList, new Comparator<User>() {
        @Override
        public int compare(User user1, User user2) {
            return Integer.compare(user1.ID, user2.ID);
        }
    });
}


    @Override
    public String toString() {
        return "User Collection: " + userList.toString();
    }
}
