package com.packagecentre.ms.deliveryservice.jpa.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.*;
//import org.springframework.data.jdbc.repository.query.Modifying;
//import org.springframework.data.jpa.repository.*;
//import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.packagecentre.ms.deliveryservice.jpa.entity.Order;



@Repository
public interface OrdersJPARepository extends JpaRepository<Order, Integer>{
	
	
	
	
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE ORDERS O SET O.PKG_ID = ?1, O.ORD_STATUS = ?2, O.STATUS_DT = ?3 WHERE O.ORD_ID = ?4 AND O.ADDR_ID = ?5 AND O.ORD_STATUS = ?6", nativeQuery = true)
	int updateOrderStatus(@Param("pkgID") String pkgID, @Param("statusNew") String statusNew, @Param("orderStatusDate") LocalDateTime orderStatusDate,
			@Param("ordID") String ordID, @Param("addrID") int addrID,@Param("statusOld") String statusOld);
	
	
 
}