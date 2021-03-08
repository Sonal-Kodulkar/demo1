package com.javadeveloperzone.controller;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "SIGNUP_DETAILS")
public class User {

    @Id
    @Column(name = "Id",columnDefinition = "int")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "User_Name")
    private String Username;
    @Column(name = "User_Password")
    private String Password;
    private String ReEnterPassword;

    public User() {
    }

    public User(String username, String password, String reEnterPassword) {
        Username = username;
        Password = password;
        ReEnterPassword = reEnterPassword;
    }

    public String getReEnterPassword() {
        return ReEnterPassword;
    }

    public void setReEnterPassword(String reEnterPassword) {
        ReEnterPassword = reEnterPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
