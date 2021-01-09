package com.alex.lrface.service.impl;

import com.alex.lrface.entity.User;
import com.alex.lrface.mapper.UserMapper;
import com.alex.lrface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author: Alex
 * @createTime: 2021/1/10
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectCheckIfUser(String loginName) {
        return userMapper.selectCheckIfUser(loginName);
    }

    @Override
    public User selectUser(String loginName, String passWord) {
        return userMapper.selectUser(loginName, passWord);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
