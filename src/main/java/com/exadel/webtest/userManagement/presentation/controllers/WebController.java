package com.exadel.webtest.userManagement.presentation.controllers;

import com.exadel.webtest.userManagement.domain.Role;
import com.exadel.webtest.userManagement.domain.User;
import com.exadel.webtest.userManagement.presentation.model.Roles;
import com.exadel.webtest.userManagement.presentation.model.UserDto;
import com.exadel.webtest.userManagement.service.UserService;
import org.hibernate.usertype.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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


    @ModelAttribute("users")
    public List<UserDto> getUsers() {
        //TODO get list of users from DB
        //test
        List<UserDto> userDtos = new ArrayList<UserDto>();
        UserDto userDto1 = new UserDto("user1","last1","mail@1","city1","state1","street1","123456789");
        UserDto userDto2 = new UserDto("user2","last2","mail@2","city2","state2","street2","987654321");
        userDtos.add(userDto1);
        userDtos.add(userDto2);
        return userDtos;
    }

    @RequestMapping(value = "/users/edit", method = RequestMethod.GET)
    public ModelAndView get(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("edit");
        String param =request.getParameter("id");
        UserDto userDto;
        if (param != null){
            //TODO get user by id
            //test
            userDto = new UserDto("user1","last1","mail@1","city1","state1","street1","123456789");
        }else {
            userDto = new UserDto();
        }
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }

    @RequestMapping(value = "/users/edit", method = RequestMethod.POST)
    public String add(HttpServletRequest request, @ModelAttribute("user") UserDto userDto) {
        String param =request.getParameter("id");

        if (param != null){
            //TODO update user in DB
            //test
            System.out.println(param+" "+ userDto.toString());
        }else{
            //TODO add user in DB
            //if on edit.jsp used "back" check if user is empty
            //test
            System.out.println("ADD : "+ userDto.toString());
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
