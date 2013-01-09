package com.exadel.webtest.userManagement.presentation.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: stsyhanou
 * Date: 27.12.12
 * Time: 11:34
 * To change this template use File | Settings | File Templates.
 */

//Test Class User

public class UserDto implements Serializable {
    private String firstName;
    private String lastName;
    private String mail;
    private String city;
    private String state;
    private String street;
    private String phone;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, String mail, String city, String state, String street, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.city = city;
        this.state = state;
        this.street = street;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public String getPhone() {
        return phone;
    }
}
