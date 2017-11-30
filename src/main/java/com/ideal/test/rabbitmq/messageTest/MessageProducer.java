package com.ideal.test.rabbitmq.messageTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lhx on 2016/9/5 9:56
 *
 * @Description
 */
@Service
public class MessageProducer {

    private Logger logger = LoggerFactory.getLogger(MessageProducer.class);

    @Resource
    private AmqpTemplate amqpTemplate;

    public void sendMessage(Object message){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        amqpTemplate = (AmqpTemplate) ctx.getBean("amqpTemplate");

        logger.info("to send message:{}",message);
        amqpTemplate.convertAndSend("queueTestKey",message);
    }
}
