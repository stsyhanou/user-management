package com.exadel.webtest.userManagement.dao;

import com.exadel.webtest.userManagement.domain.User;

/**
 * Created by IntelliJ IDEA.
 * User: stsyhanou
 * Date: 22.12.12
 * Time: 2:32
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    public void add(User user);
    public void remove(Integer id);
}
