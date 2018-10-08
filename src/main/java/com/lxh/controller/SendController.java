package com.lxh.controller;

import com.lxh.config.RabbitMQTopicConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 刘晓禾
 * @date 2018/10/3 18:37
 * @company www.tydic.com
 * @description  发送者Controller
 */

@RestController
public class SendController {
    @Resource
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/topicSendOne")
    public String topicSendOne(){
        String content  = "my topic 1";
        System.out.println("发送者内容:"+content);
        this.amqpTemplate.convertAndSend("exchange", RabbitMQTopicConfig.message,content);
        return content;
    }

    @RequestMapping("/topicSendTwo")
    public String topicSendTwo(){
        String content = "my topic 2";
        System.out.println("发送者内容:"+content);
        this.amqpTemplate.convertAndSend("exchange",RabbitMQTopicConfig.messages);
        return content;
    }
}
