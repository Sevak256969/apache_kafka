package com.amiya.apachekafkaconsumerdemo.consumer;

import com.amiya.apachekafkaconsumerdemo.Model.Book;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "NewTopic",
            groupId = "group_id",
            containerFactory = "bookListener")

    public void
    consume(Book book)
    {
        // Print statement
        System.out.println("message = " + book);
    }
}
