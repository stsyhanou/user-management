package com.exadel.webtest.userManagement.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 *@author Pavel Hutnik
 */
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue
    private int roleId;

    @Column(name = "role")
    private String role;

    @ManyToMany(fetch = FetchType.LAZY , mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    public int getRoleId() {
        return roleId;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
