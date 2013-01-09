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
    private int roleId;

    @Column(name = "role")
    private String role;

    public int getRoleId() {
        return roleId;
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
