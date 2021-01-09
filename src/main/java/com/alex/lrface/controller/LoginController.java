package com.alex.lrface.controller;

import com.alex.lrface.baiduai.FaceUtils;
import com.alex.lrface.common.ResultUtil;
import com.alex.lrface.entity.User;
import com.alex.lrface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录Controller
 *
 * @author: Alex
 * @createTime: 2021/1/10
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到登录页
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 人脸登录
     */
    @PostMapping("/faceLogin")
    @ResponseBody
    public ResultUtil faceLogin(User user, String file) {
        User user1 = userService.selectCheckIfUser(user.getUserName());
        if (user1 == null) {
            return ResultUtil.error("该用户不存在");
        }
        String face = FaceUtils.search(file, user.getUserName(), "feifan");
        if (!"200".equals(face)) {
            return ResultUtil.error(face);
        }

        return ResultUtil.success("登录成功");
    }
}
