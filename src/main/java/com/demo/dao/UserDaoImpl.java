package com.demo.dao;

import org.springframework.stereotype.Repository;

/**
 * @author wangyuepeng
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public String addUser() {
        String str = this.getClass().getName();
        System.out.println(str);
        return str;
    }
}
