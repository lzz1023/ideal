package com.ideal.test.rabbitmq.fanoutTest;

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
public class FanoutProducer {

    private Logger logger = LoggerFactory.getLogger(FanoutProducer.class);

    @Resource
    private AmqpTemplate fanoutTemplate;

    public void sendMessage(Object message){
        logger.info("to send message:{}",message);
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        fanoutTemplate = (AmqpTemplate) ctx.getBean("fanoutTemplate");
        System.out.println(message);
        fanoutTemplate.convertAndSend("info.debug",message);
    }
}
