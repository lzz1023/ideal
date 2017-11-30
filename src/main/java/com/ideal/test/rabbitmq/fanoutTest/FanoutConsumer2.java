package com.ideal.test.rabbitmq.fanoutTest;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lhx on 2016/9/5 17:52
 *
 * @Description
 */
public class FanoutConsumer2 implements MessageListener{

    public void foo(String str) {
        System.out.println(str);
    }

    public static void main(final String... args) throws Exception {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        FanoutProducer fanoutProducer = (FanoutProducer) ctx.getBean("fanoutProducer");
        fanoutProducer.sendMessage("++++++fanoutProducer++++++++++++hello,xin3453465465467456456456^^^^^^66666!hello,xin");
        Thread.sleep(1000);
        ctx.destroy();
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("message22222222================="+message);
        System.out.println("message22222222's body================"+new String(message.getBody()));
    }
}
