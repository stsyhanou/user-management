package com.exadel.webtest.userManagement.controllers;

import com.exadel.webtest.userManagement.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

@Controller
@RequestMapping(value = "/")
public class WebController {

    @ModelAttribute("users")
    public List<User> getUsers() {
        //TODO get list of users from DB
        //test
        List<User> users = new ArrayList<User>();
        User user1 = new User("user1","last1","mail@1","city1","state1","street1","123456789");
        User user2 = new User("user2","last2","mail@2","city2","state2","street2","987654321");
        users.add(user1);
        users.add(user2);
        return users;
    }

    @RequestMapping(value = "/users/edit", method = RequestMethod.GET)
    public ModelAndView get(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("edit");
        String param =request.getParameter("id");
        User user;
        if (param != null){
            //TODO get user by id
            //test
            user = new User("user1","last1","mail@1","city1","state1","street1","123456789");
        }else {
            user = new User();
        }
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/users/edit", method = RequestMethod.POST)
    public String add(HttpServletRequest request, @ModelAttribute("user") User user) {
        String param =request.getParameter("id");

        if (param != null){
            //TODO update user in DB
            //test
            System.out.println(param+" "+user.toString());
        }else{
            //TODO add user in DB
            //if on edit.jsp used "back" check if user is empty
            //test
            System.out.println("ADD : "+user.toString());
        }
        return "redirect:/users";
    }

    @RequestMapping(value = "/users/delete", method = RequestMethod.GET)
    public String delete(HttpServletRequest request) {
        String param =request.getParameter("id");
        //TODO delete user from DB
        //test
        System.out.println("DELETE: "+param);
        return "redirect:/users";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView loadUsers() {
        return new ModelAndView("users");
    }

    @RequestMapping(value = "/management")
    public String loadPage() {
        return "management";
    }

    @RequestMapping(value = "/welcome")
    public String welcomePage() {
        return "users";
    }

}
