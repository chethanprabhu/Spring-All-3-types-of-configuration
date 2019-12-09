package com.AnnotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ferrari implements Car {

	DiscountCoupon discountCoupon;
	
	@Autowired //Constructor Injection
	public Ferrari(@Qualifier("ferrariDiscount")DiscountCoupon obj) {
		discountCoupon = obj;
	}
	
//	@Autowired //Setter Injection
//	@Qualifier("ferrariDiscount")
//	public void setFerrari(DiscountCoupon obj) {
//		discountCoupon = obj;
//	}
	
	@Value("${SPECIALCODE}")
	public String couponCode;
	
	public void displaySpecialCode() {
		System.out.println(couponCode);
	}
	
	@Override
	public void startCar() {
		System.out.println("Ferrari car started");
	}

	@Override
	public void stopCar() {
		System.out.println("Ferrari car stopped");
	}

	@Override
	public void getDiscountCode() {
		discountCoupon.getDiscountCode();
	}

}
