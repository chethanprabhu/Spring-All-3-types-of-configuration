package com.XMLConfiguration;

public class BMW implements Car {

	DiscountCoupon discountCoupon;
	Boolean SpecialDiscount = false;
	String code;
	
	public void setBMWdiscount(BMWdiscount obj) {
		discountCoupon = obj;
	}
	
	public void setflag(String specialCode) {
		code = specialCode; 
		SpecialDiscount = true;
	}
	
	@Override
	public void startCar() {
		System.out.println("BMW started");
	}

	@Override
	public void stopCar() {
		System.out.println("BMW stopped");
	}
	
	public void getDiscountCode() {
		discountCoupon.getDiscountCode();
		if(SpecialDiscount) {	
			System.out.println("Congrats You have additional Discount of 5% for applying the code " + code);
		}
	}

}
