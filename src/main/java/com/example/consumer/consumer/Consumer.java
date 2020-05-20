package com.example.consumer.consumer;

import com.example.model.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Consumer
{

    @RabbitListener(queues = "${spring.rabbitmq.queue.listener}",containerFactory = "createListener")
    public void recieveMessage(Message aan)
    {
        System.out.println(aan.getMessage());
        System.out.println(aan.getUmur());
    }
}
