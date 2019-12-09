package com.NOXMLconfiguration;

import org.springframework.stereotype.Component;

@Component
public class BMWdiscount implements DiscountCoupon {

	@Override
	public void getDiscountCode() {
		System.out.println("BMW gives 20% discount");
	}

}
