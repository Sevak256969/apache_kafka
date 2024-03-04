//package com.amiya.apachekafkaconsumerdemo.producer;
//
//import com.amiya.apachekafkaconsumerdemo.Model.Book;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.springframework.stereotype.Component;
//import java.util.Properties;
//
//@Component
//public class BookProducer {
//    private final KafkaProducer<String, String> producer;
//    private final String topic;
//    private final ObjectMapper objectMapper;
//
//    public BookProducer() {
//        this.topic = "NewTopic";
//        this.objectMapper = new ObjectMapper();
//        this.producer = createKafkaProducer();
//    }
//
//    private KafkaProducer<String, String> createKafkaProducer() {
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "localhost:9092");
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        return new KafkaProducer<>(props);
//    }
//
//    public void send(Book book) throws JsonProcessingException {
//        String jsonBook = objectMapper.writeValueAsString(book);
//        producer.send(new ProducerRecord<>(topic, jsonBook));
//    }
//
//    public void close() {
//        producer.close();
//    }
//}