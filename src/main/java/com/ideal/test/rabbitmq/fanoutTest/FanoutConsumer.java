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
public class FanoutConsumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println("message=============================="+message);
        System.out.println("message's String ================"+new String(message.getBody()));
    }

    public void foo(String foo) {
        System.out.println("+++++++++===========+++++++++" + foo);
    }

    public static void main(final String... args) throws Exception {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        FanoutProducer fanoutProducer = (FanoutProducer) ctx.getBean("fanoutProducer");
        fanoutProducer.sendMessage("++++++fanoutProducer++++++++++++hello,xin3453465465467456456456^^^^^^66666!hello,xin");
        Thread.sleep(1000);
        ctx.destroy();
    }
}
