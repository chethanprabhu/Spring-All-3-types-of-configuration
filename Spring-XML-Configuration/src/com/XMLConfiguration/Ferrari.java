package com.XMLConfiguration;

public class Ferrari implements Car {

	DiscountCoupon discountCoupon;
	Boolean SpecialDiscount = false;
	String code;
	
	public Ferrari(FerrariDiscount obj) {
		discountCoupon = obj;
	}
	
	public void init() {
		System.out.println("Init method called");
	}
	
	public void destroy() {
		System.out.println("Destroy method called");
	}
	
	public Ferrari(FerrariDiscount obj, String specialCode) {
		discountCoupon = obj;
		code = specialCode;
		SpecialDiscount = true;
	}
	
	@Override
	public void startCar() {
		System.out.println("Ferrari started");
	}

	@Override
	public void stopCar() {
		System.out.println("Ferrari stopped");
	}

	public void getDiscountCode() {
		discountCoupon.getDiscountCode();
		if(SpecialDiscount) {	
			System.out.println("Congrats You have additional Discount of 5% for applying the code " + code);
		}
	}
}
