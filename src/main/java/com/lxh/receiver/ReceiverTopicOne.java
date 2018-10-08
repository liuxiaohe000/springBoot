package com.lxh.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 刘晓禾
 * @date 2018/10/3 18:38
 * @company www.tydic.com
 * @description  接受者One
 */

@Component
//@RabbitListener的作用就是把当前类监听消息队列
@RabbitListener(queues = "topic.message")
public class ReceiverTopicOne {


    //@RabbitHandler当监听到消息队列的消息时，被这个注解的方法负责处理消息队列中的消息
    @RabbitHandler
    public void process(String meg){

    }

}
