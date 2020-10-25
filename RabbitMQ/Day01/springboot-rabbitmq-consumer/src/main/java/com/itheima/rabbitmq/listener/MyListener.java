package com.itheima.rabbitmq.listener;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
    @RabbitListener(queues = "item_queue")
    public void getMessage(Message message){
        String string = new String(message.getBody());
        System.out.println("接收到的消息为"+string);
    }
}