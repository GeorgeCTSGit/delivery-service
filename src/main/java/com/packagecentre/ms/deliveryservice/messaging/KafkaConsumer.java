package com.packagecentre.ms.deliveryservice.messaging;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.packagecentre.ms.deliveryservice.service.DeliveryService;


@Component
public class KafkaConsumer {
	
	@Autowired
	private DeliveryService dlvSvc;
	
	static Logger logger = Logger.getLogger(KafkaConsumer.class.getName());
	
	
	@KafkaListener(topics="dlvyTopic", groupId="dlvyTopicGroup")
	public void consume(String data)  {
		logger.info("data received"+ data);
		
		dlvSvc.processData(data);		
		
	}
	    
	
}
