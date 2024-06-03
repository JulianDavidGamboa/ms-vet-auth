package com.vetapp.app.msauth.domain.model;

public class User {

    private String name;
    private String email;
    private String password;
    private String rol;
    private String phoneNumber;
    private String address;
    private String active;

    public User(String name, String email, String password, String rol, String phoneNumber, String address, String active) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.active = active;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
