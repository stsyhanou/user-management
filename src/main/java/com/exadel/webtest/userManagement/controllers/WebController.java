package com.exadel.webtest.userManagement.controllers;

import com.exadel.webtest.userManagement.domain.Role;
import com.exadel.webtest.userManagement.domain.User;
import com.exadel.webtest.userManagement.service.UserService;
import com.exadel.webtest.userManagement.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: stsyhanou
 * Date: 22.12.12
 * Time: 4:55
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class WebController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/management")
    public String loadPage() {
        return "management";
    }

    @RequestMapping(value = "/login")
    public String loginPage() {
        User user = new User();
        user.setName("test");
        user.setPassword("test");
        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setRole("SuperUser");
        roles.add(role);
        user.setRoles(roles);
        userService.add(user);
        return "login";
    }

    @RequestMapping(value = "/add")
    public String addUser() {
        return "add";
    }

    @RequestMapping(value = "/users")
    public String loadUsers() {
        return "users";
    }
}
