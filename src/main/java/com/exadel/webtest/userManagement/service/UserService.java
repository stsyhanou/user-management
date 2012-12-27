package com.exadel.webtest.userManagement.service;

import com.exadel.webtest.userManagement.domain.User;

/**
 * Created by IntelliJ IDEA.
 * User: stsyhanou
 * Date: 22.12.12
 * Time: 2:37
 * To change this template use File | Settings | File Templates.
 */

public interface UserService {
    public void add(User user);
    public void remove(Integer id);
}
