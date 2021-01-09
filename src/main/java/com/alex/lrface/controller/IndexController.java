package com.alex.lrface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页Controller
 *
 * @author: Alex
 * @createTime: 2021/1/10
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
@Controller
public class IndexController {

    /**
     * 跳转到首页
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
