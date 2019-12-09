package com.AnnotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class BMWdiscount implements DiscountCoupon {

	@Override
	public void getDiscountCode() {
		System.out.println("BMW20 for 20% discount");
	}

}
