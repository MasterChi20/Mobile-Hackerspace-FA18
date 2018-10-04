package com.example.zach.cs196fall2018;

import java.util.ArrayList;

import sun.jvm.hotspot.utilities.BitMap;

public class Person {
    public static ArrayList<Person> people = new ArrayList<>();
    private String name = "";
    private String email = "";
    private String phone = "";
    private String address = "";
    private BitMap bmp;

    public String getName() {
        return name;
    }

    public BitMap getBmp() {
        return bmp;
    }

    public void setBmp(BitMap bmp) {
        this.bmp = bmp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
