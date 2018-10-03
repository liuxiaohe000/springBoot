package com.lxh.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘晓禾
 * @date 2018/9/26 17:25
 * @company www.tydic.com
 * @description  RabbitMq消息队列的配置
 */

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue(){
        return new Queue("TestQueue1");
    }

}
