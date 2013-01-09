package com.exadel.webtest.userManagement.converter;

import com.exadel.webtest.userManagement.domain.User;
import com.exadel.webtest.userManagement.presentation.model.UserDto;

/**
 * Created with IntelliJ IDEA.
 * User: Tsyhanou Siarhei
 * Date: 09.01.13
 * Time: 14:26
 * To change this template use File | Settings | File Templates.
 */
public class UserConverter {
    public static User convertToUser(UserDto userDto){
        User user = new User();
        user.setUserId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setCity(userDto.getCity());
        user.setState(userDto.getState());
        user.setStreet(userDto.getStreet());
        user.setPhone(userDto.getPhone());
        user.setPassword(userDto.getPassword());
        return user;
    }
    public static UserDto convertToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getUserId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setCity(user.getCity());
        userDto.setState(user.getState());
        userDto.setStreet(user.getStreet());
        userDto.setPhone(user.getPhone());
        userDto.setPassword(user.getPassword());
        return userDto;
    }
}
