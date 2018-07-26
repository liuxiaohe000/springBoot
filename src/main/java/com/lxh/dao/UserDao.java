package com.lxh.dao;

import com.lxh.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by HASEE on 2018/7/26.
 */

@Repository
public interface UserDao {

    public User getById(int id);
}
