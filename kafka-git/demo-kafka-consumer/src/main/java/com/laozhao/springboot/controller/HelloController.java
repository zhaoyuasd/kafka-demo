package com.laozhao.springboot.controller;

import com.laozhao.springboot.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by viruser on 2018/9/4.
 */
@RestController
public class HelloController {

    //@Autowired
    private KafkaProducer kafkaProducer;
    @RequestMapping("hello")
    public String hello(){
        //kafkaProducer.send();
        return "done";
    }
}
