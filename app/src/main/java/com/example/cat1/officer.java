package com.example.cat1;

import java.util.UUID;

public class officer {
    private String name,gender,email,password;
    private UUID ID;
    private int phoneNumber;

    public officer(){

    }

    public officer(UUID ID,String name, String email, String password,  String gender, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.ID = ID;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
