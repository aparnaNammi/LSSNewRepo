package com.twilio.verification.model;

import java.util.Date;

@SuppressWarnings("unused")
public class User {
    private int id;

    private String name;

    private String email;

    private String password;

    private String countryCode;

    private String phoneNumber;

    private int authyId;

    private boolean verified;

    private Date date;

    public User() {
    }

    public User(String name, String email, String password, String countryCode, String phoneNumber, int authyId) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.authyId = authyId;
        this.verified = false;
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullPhoneNumber() {
        return countryCode + phoneNumber;
    }

    public int getAuthyId() {
        return authyId;
    }

    public void setAuthyId(int authyId) {
        this.authyId = authyId;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
