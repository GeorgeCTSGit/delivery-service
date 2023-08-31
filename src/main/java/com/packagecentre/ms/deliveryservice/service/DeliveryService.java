package com.packagecentre.ms.deliveryservice.service;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.packagecentre.ms.deliveryservice.dto.DeliveryPackage;
import com.packagecentre.ms.deliveryservice.jpa.repository.OrdersJPARepository;
import com.packagecentre.ms.deliveryservice.messaging.KafkaConsumer;

@Transactional
@Service
public class DeliveryService {
	
	static Logger logger = Logger.getLogger(DeliveryService.class.getName());
	
	@Autowired
	OrdersJPARepository orderJPARepo;
	
	public void processData(String data) {
		
		logger.info("processing data for delivery===>");
		DeliveryPackage dpkg = new Gson().fromJson(data, DeliveryPackage.class);
		logger.info("Recevied following package to be delivered ==>");
		if(dpkg.getAddr() != null) {
			logger.info("------------------------------------------");
			logger.info("Package ID: "+ dpkg.getPackageID()+"; Zone: "+ dpkg.getAddr().getZone());
			logger.info("No. of Items to deliver: "+ dpkg.getItems().size());
			logger.info("------------------------------------------");
		}
		updateOrderDlvyStatus(dpkg);
	}
	
	
private void updateOrderDlvyStatus(DeliveryPackage dpkg) {
		
		logger.info("Orders updating===>>>>" );
		
		
		logger.info("updating DELIVERY status for ORDERS table with pkgID : "+ dpkg.getPackageID()+ " for order: "+ dpkg.getOrderID());
		
		orderJPARepo.flush();
		int result = orderJPARepo.updateOrderStatus(dpkg.getPackageID(), "DELIVERY", LocalDateTime.now(),  dpkg.getOrderID(), dpkg.getAddr().getAddrID(), "PACKAGED");
		logger.info("execution result ===> "+ result);
			
	
		
	}

}
