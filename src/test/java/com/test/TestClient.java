package com.test;

import com.ConsumerServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/6/27.
 */
public class TestClient {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-dubbo-client.xml");

        ConsumerServer consumerService = (ConsumerServer) ac.getBean("consumerService");
        for (int i = 0; true; i++) {
            consumerService.sayHello("我不是超人" + i);
            Thread.sleep(3000);
        }

    }

}
