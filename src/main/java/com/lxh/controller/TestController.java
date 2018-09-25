package com.lxh.controller;

import com.lxh.pojo.User;
import com.lxh.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by HASEE on 2018/7/25.
 */

@RestController
public class TestController {

    @Resource
    private UserService userService;

    @RequestMapping("/queryUser")
    public String Test1(String id){
        return userService.getUserById(Integer.parseInt(id)).getName();
    }
    @GetMapping("query/{id}")
    public String Test2(@PathVariable("id") String id){
        return ""+id;
    }

    @GetMapping("/query/{queryid}")
    public String Test3(){
        return null;
    }
}
