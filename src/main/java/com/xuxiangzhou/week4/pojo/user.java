package com.xuxiangzhou.week4.pojo;

public class user {
    private String id;

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

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", UserName=" + UserName +
                ", password=" + password +
                ", Email=" + Email +
                ", Gender=" + Gender +
                ", Birthdate=" + Birthdate +
                '}';
    }

    private String UserName;
    private String password;
    private String Email;
    private String Gender;
    private String Birthdate;
}
