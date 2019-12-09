package com.NOXMLconfiguration;

import org.springframework.stereotype.Component;

@Component
public class FerrariDiscount implements DiscountCoupon {

	@Override
	public void getDiscountCode() {
		System.out.println("Ferrari gives 10% discount");
	}

}
