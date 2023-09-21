package com.delivery.deliveryboy.service;

import com.delivery.deliveryboy.constants.KafkaConstants;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
        kafkaTemplate.send(KafkaConstants.LOCATION_TOPIC_NAME,location);
        logger.info("location update");
        return true;
    }
}
