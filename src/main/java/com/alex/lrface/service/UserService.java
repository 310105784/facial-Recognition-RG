package com.alex.lrface.service;

import com.alex.lrface.entity.User;

/**
 * TODO
 *
 * @author: Alex
 * @createTime: 2021/1/10
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
public interface UserService {

    /**
     * 查询用户是否存在
     *
     * @param loginName 登录名
     * @return 返回User对象
     */
    User selectCheckIfUser(String loginName);

    /**
     * 查询用户
     * @param loginName 登录名
     * @param passWord 登录密码
     * @return 返回User对象
     */
    User selectUser(String loginName, String passWord);

    /**
     * 添加用户
     *
     * @param user User对象
     */
    void insertUser(User user);

}
