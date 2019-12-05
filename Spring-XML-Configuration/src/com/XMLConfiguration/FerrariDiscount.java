package com.XMLConfiguration;

public class FerrariDiscount implements DiscountCoupon {

	@Override
	public void getDiscountCode() {
		System.out.println("FERRARI35 to get 35% discount on Ferrari Tires");
	}

}
