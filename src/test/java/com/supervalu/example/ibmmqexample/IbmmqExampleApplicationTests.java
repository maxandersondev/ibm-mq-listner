package com.supervalu.example.ibmmqexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessagePostProcessor;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IbmmqExampleApplicationTests {


    @Autowired
    private JmsTemplate queueTemplate;


    private String queue = "MOBLMERCH.SELLCOST.TO.MERCH";


//    @Test
//    public void sendMessageToQueue() {
//
//        queueTemplate.convertAndSend(queue, "hello world");
//    }
//    @Test
//    public void receiveMessageFromQueue() {
//
//        queueTemplate.receiveAndConvert(queue);
//    }





}
