package com.demo.service;

import com.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangyuepeng
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public String addUser() {
        String str = this.getClass().getName();
        System.out.println(str);
        userDao.addUser();
        return str;
    }
}
