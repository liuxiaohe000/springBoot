package com.lxh.service.impl;

import com.lxh.dao.UserDao;
import com.lxh.pojo.User;
import com.lxh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by HASEE on 2018/7/26.
 */

@Service
public class UserServiceImpl  implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(int id) {
        return userDao.getById(id);
    }
}
