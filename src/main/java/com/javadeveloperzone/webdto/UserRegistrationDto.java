package com.javadeveloperzone.webdto;

public class  UserRegistrationDto {
    private String userName;
    private String password;
    private String reenterPassword;

    public UserRegistrationDto(String userName, String password, String reenterPassword) {
        this.userName = userName;
        this.password = password;
        this.reenterPassword = reenterPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReenterPassword() {
        return reenterPassword;
    }

    public void setReenterPassword(String reenterPassword) {
        this.reenterPassword = reenterPassword;
    }
}
