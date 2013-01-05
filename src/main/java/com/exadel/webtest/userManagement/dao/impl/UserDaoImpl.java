package com.exadel.webtest.userManagement.dao.impl;

import com.exadel.webtest.userManagement.dao.UserDao;
import com.exadel.webtest.userManagement.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: stsyhanou
 * Date: 22.12.12
 * Time: 2:33
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public void remove(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
