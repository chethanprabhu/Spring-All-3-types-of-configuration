package com.AnnotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class FerrariDiscount implements DiscountCoupon {

	@Override
	public void getDiscountCode() {
		System.out.println("FERRARI15 for 15% discount");
	}

}
