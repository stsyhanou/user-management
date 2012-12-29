package com.exadel.webtest.userManagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stsyhanou
 * Date: 22.12.12
 * Time: 4:55
 * To change this template use File | Settings | File Templates.
 */

@org.springframework.stereotype.Controller
@RequestMapping(value = "/")
public class WebController {

    @RequestMapping(value = "/management")
    public String loadPage() {
        return "management";
    }
    @RequestMapping(value = "/add")
    public String addUser() {
        return "add";
    }
    @RequestMapping(value = "/users")
    public String loadUsers() {
        return "users";
    }
    @RequestMapping(value = "/welcome")
    public String welcomePage() {
        return "users";
    }

}
