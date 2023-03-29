package com.random.testi;

import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> students = new ArrayList<>();

    private static UserStorage userStorage = null;

    private UserStorage() {
    }

    public static UserStorage getInstance() {
        if (userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList<User> getUsers() {
        return students;
    }

    public void addUser(User user) {
        students.add(user);
    }
}