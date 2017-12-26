package com.ideal.test.rabbitmq.topicTest;

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
public class TopicProducer {

    private Logger logger = LoggerFactory.getLogger(TopicProducer.class);

    @Resource
    private AmqpTemplate topicTemplate;

    public void sendMessage(Object message){
        logger.info("to send message:{}",message);
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        topicTemplate = (AmqpTemplate) ctx.getBean("topicTemplate");
        topicTemplate.convertAndSend("info.info",message);
    }
}
