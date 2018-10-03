package com.lxh.controller;

import com.lxh.pojo.User;
import com.lxh.service.UserService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by HASEE on 2018/7/25.
 */

@RestController
public class TestController {

    @Resource
    private UserService userService;

    @Resource
    private AmqpTemplate amqpTemplate;

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
        int i = 1;
        for(int j = 0;j<=i ;j++){
            System.out.println(i);
        }
        return null;
    }


    /**
     *
     * 功能描述: 创建一个Queue
     *
     * @param
     * @return
     * @throws
     * @auther 刘晓禾
     * @date  2018/9/29
     */
    @RequestMapping("/send")
    public String send(){
         String content = "Date"+new Date();
         amqpTemplate.convertAndSend(content);
         return content;
    }


    @RequestMapping("/batchSend")
    public String batchSend(){
        StringBuilder times=new StringBuilder();
        for(int i=0;i<10;i++){
            long time=System.nanoTime();
            amqpTemplate.convertAndSend("TestQueue1","第"+i+"次发送的时间："+time);
            times.append(time+"<br>");
        }
        return times.toString();
    }
}

