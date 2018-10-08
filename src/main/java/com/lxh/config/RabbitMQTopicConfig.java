package com.lxh.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘晓禾
 * @date 2018/10/3 17:14
 * @company www.tydic.com
 * @description  RabbitMQ的Topic配置分式Config
 */

@Configuration
public class RabbitMQTopicConfig {

    public final static String message = "topic.message";

    public final static String messages = "topic.messages";

    @Bean
    public Queue queryMessage(){
        return new Queue(RabbitMQTopicConfig.message);
    }

    @Bean
    public Queue queryMessages(){
        return new Queue(RabbitMQTopicConfig.messages);
    }

    /**
     *
     * 功能描述: 创建一个Topic路由
     *
     * @param
     * @return
     * @throws
     * @auther 刘晓禾
     * @date  2018/10/3
     */
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("exchange");
    }

    @Bean
    public Binding bindingExchangeMessage(Queue queryMessage,TopicExchange topicExchange){
        //bing的Queue，to的TopicExchange，with的routingKey
        return BindingBuilder.bind(queryMessage).to(topicExchange).with(message);
    }

    @Bean
    public Binding bindingExchangeMessages(Queue queryMessages,TopicExchange topicExchange){
        return BindingBuilder.bind(queryMessages).to(topicExchange).with(messages);
    }
}

