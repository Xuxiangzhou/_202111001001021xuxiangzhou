package com.xuxiangzhou.model;

import java.util.Date;

public class User {
    private String id;
    private String UserName;
    private String password;
    private String Email;
    private String Gender;
    private Date Birthdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public User(String id, String userName, String password, String email, String gender, Date birthdate) {
        this.id = id;
        UserName = userName;
        this.password = password;
        Email = email;
        Gender = gender;
        Birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                ", Email='" + Email + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Birthdate='" + Birthdate + '\'' +
                '}';
    }
}
