package com.exadel.webtest.userManagement.service.impl;

import com.exadel.webtest.userManagement.dao.Dao;
import com.exadel.webtest.userManagement.domain.User;
import com.exadel.webtest.userManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: stsyhanou
 * Date: 22.12.12
 * Time: 2:38
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {
    @Qualifier("userDaoImpl")
    @Autowired
    private Dao dao;

    @Transactional
    public void add(User user) {
        System.out.println(user.getEmail());
        if(dao == null)
        {
            System.out.println("bean is not created");
        }
        dao.add(user);
    }

    public void remove(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
