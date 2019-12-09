package com.NOXMLconfiguration;

public class Ferrari implements Car {

	DiscountCoupon discountCoupon;
	
	public void setFerrariDiscount(DiscountCoupon obj) {
		discountCoupon = obj;
	}
	
	public Ferrari() {	
	}
	
	@Override
	public void startCar() {
		System.out.println("Ferrari started");
	}

	@Override
	public void stopCar() {
		System.out.println("Ferrari stopped");
	}

	@Override
	public void getDiscountCode() {
		
	}

	@Override
	public void displaySpecialCode() {
		
	}

}
