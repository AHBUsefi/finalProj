package com.shop.service;

import com.shop.model.User;

import java.util.List;

public class UserService {
    private List<User> users;

    public UserService(List<User> users) {
        this.users = users;
    }

    public User authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
