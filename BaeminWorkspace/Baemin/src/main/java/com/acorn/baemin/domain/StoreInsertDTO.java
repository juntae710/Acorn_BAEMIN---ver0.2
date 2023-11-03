package com.acorn.baemin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreInsertDTO {
	String storeName;
	String storeCategory ;
	String storeImage ;
	String storeAddress ;
	String storePhone ; 
	int minOrderPrice ; 
	int deliveryFee ; 
	String deliveryArea ;
}
