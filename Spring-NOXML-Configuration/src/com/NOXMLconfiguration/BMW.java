package com.NOXMLconfiguration;

public class BMW implements Car {

	String couponCode;
	
	DiscountCoupon discountCoupon;
	
	public void setCouponCode(String code) {
		couponCode = code;
	}
	
	public BMW(DiscountCoupon obj) {
		this.discountCoupon = obj;
	}
	
	@Override
	public void startCar() {
		System.out.println("BMW started");
	}

	@Override
	public void stopCar() {
		System.out.println("BMW stopped");
	}

	@Override
	public void getDiscountCode() {
		discountCoupon.getDiscountCode();
	}

	@Override
	public void displaySpecialCode() {
		System.out.println(couponCode);
	}

}
