package com.laozhao.springboot.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * Created by viruser on 2018/9/4.
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "tst")
    public void tstTopic(ConsumerRecord<String,String> record){
        String value=record.value();
        System.out.println("consumer tst msg:"+value);
    }
}
