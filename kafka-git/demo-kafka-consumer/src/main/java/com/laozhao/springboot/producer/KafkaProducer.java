package com.laozhao.springboot.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by viruser on 2018/9/4.
 */
///@Component
public class KafkaProducer {
   // @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void send(){
        /*Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());*/
        System.out.println("++++++++++++++message:{}asdasdadsads");
        kafkaTemplate.send("ship","asddadferfewtewr");
    }
}
