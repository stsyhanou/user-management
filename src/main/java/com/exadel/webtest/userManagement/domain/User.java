package com.exadel.webtest.userManagement.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: phutnik
 * Date: 22.12.12
 * Time: 7:05
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
        @Column(name = "ID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int userId;

        @Column(name = "firstName")
        private String firstName;

        @Column(name = "lastName")
        private String lastName;

        @Column(name = "email")
        private String email;

        @Column(name = "city")
        private String city;

        @Column(name ="state")
        private String state;

        @Column(name = "street")
        private String street;

        @Column(name = "phone")
        private String phone;

        @Column(name = "password")
        private String password;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "userRoles", joinColumns = { @JoinColumn(name = "userID") }, inverseJoinColumns = { @JoinColumn(name = "roleID") })
        private Set<Role> roles = new HashSet<Role>();

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
