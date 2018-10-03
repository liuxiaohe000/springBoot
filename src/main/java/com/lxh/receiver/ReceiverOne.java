package com.lxh.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 刘晓禾
 * @date 2018/9/29 14:11
 * @company www.tydic.com
 * @description  消费者one
 */

@Component
@RabbitListener(queues = "TestQueue1")
public class ReceiverOne {

    @RabbitHandler
    public void receiver(String msg){
        System.out.println("Test1 receiver1:"+msg);
    }

}
