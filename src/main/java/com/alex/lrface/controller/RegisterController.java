package com.alex.lrface.controller;

import com.alex.lrface.baiduai.FaceUtils;
import com.alex.lrface.common.ResultUtil;
import com.alex.lrface.entity.User;
import com.alex.lrface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注册Controller
 *
 * @author: Alex
 * @createTime: 2021/1/10
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到注册页
     */
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * 人脸注册
     * @param user User对象
     * @param file 人脸Base64
     * @return json结果
     */
    @PostMapping("/faceRegister")
    @ResponseBody
    public ResultUtil faceRegister(User user, String file) {
        User user1 = userService.selectCheckIfUser(user.getUserName());
        if (user1 != null) {
            return ResultUtil.error("该用户名已被注册");
        }
        String face = FaceUtils.addUser(file, "feifan", user.getUserName(), user.getUserName());
        if (!"200".equals(face)) {
            return ResultUtil.error(face);
        }
        userService.insertUser(user);
        return ResultUtil.success("注册成功");
    }
}
