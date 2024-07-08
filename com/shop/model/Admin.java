package com.shop.model;

public class Admin extends User {
    public Admin(String username, String password, String email, String address, String phoneNumber) {
        super(username, password, email, address, phoneNumber);
    }

    // متدهای مدیریتی مانند افزودن و حذف کاربران
}
