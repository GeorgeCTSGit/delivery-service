package com.packagecentre.ms.deliveryservice.messaging;

import java.util.*;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.*;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.*;

import com.packagecentre.ms.deliveryservice.util.DeliveryConstants;


@EnableKafka
@Configuration
public class KafkaConfig {
	
	
	//CONSUMER
	@Bean
    public ConsumerFactory<String, String> consumerFactory()
    {
		Map<String, Object> config = new HashMap<>();
		
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, new StringDeserializer().getClass().getName());
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, new StringDeserializer().getClass().getName());
        config.put(ConsumerConfig.GROUP_ID_CONFIG, DeliveryConstants.DLVY_TOPIC_GRP_ID);
        config.put(ConsumerConfig.CLIENT_ID_CONFIG, DeliveryConstants.CLIENT_ID);
		
		return new DefaultKafkaConsumerFactory<>(config);
    }
	
	// Creating a Listener
    public ConcurrentKafkaListenerContainerFactory
    concurrentKafkaListenerContainerFactory()
    {
        ConcurrentKafkaListenerContainerFactory<
            String, String> factory
            = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
	
}
