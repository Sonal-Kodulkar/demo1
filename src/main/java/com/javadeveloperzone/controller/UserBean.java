package com.javadeveloperzone.controller;

public class UserBean {
    private String Username;
    private String Password;
    private String ReEnterPassword;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getReEnterPassword() {
        return ReEnterPassword;
    }

    public void setReEnterPassword(String reEnterPassword) {
        ReEnterPassword = reEnterPassword;
    }
}
