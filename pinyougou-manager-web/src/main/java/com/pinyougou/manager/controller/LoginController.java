package com.pinyougou.manager.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 麦客子
 * @desc
 * @email leeshuhua@163.com
 * @create 2018/09/16 0:36
 **/

@RestController
@RequestMapping("/login")
public class LoginController {

    /**
     * 获取登录用户名
     * @return
     */
    @RequestMapping("/name")
    public Map name(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map map = new HashMap<>();
        map.put("loginName",name);
        return map;
    }
}
