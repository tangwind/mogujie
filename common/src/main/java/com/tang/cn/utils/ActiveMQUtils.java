package com.tang.cn.utils;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * @author tangchaochao
 * @create 2020-2020-09-18 14:04
 */
@Component
public class ActiveMQUtils {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendQueueMsg(String name, Object msg) {
        Destination destination = new ActiveMQQueue(name);
        jmsMessagingTemplate.convertAndSend(destination, msg);
    }
    public void sendTopicMsg(String name, Object msg){
        Destination destination = new ActiveMQTopic(name);
        jmsMessagingTemplate.convertAndSend(destination, msg);
    }

}
