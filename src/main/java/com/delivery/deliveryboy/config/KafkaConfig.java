package com.delivery.deliveryboy.config;

import com.delivery.deliveryboy.constants.KafkaConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){

        return TopicBuilder.name(KafkaConstants.LOCATION_TOPIC_NAME).build();
    }
}
