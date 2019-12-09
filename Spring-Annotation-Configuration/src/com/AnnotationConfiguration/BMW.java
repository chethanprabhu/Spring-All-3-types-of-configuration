package com.AnnotationConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("BMWBEAN")
@Scope("singleton")
public class BMW implements Car {
	
	@Autowired //Field Injection
	@Qualifier("BMWdiscount")
	DiscountCoupon discountCoupon;
	
	@Value("${SPECIALCODE}")
	public String couponCode;
	
	public void displaySpecialCode() {
		System.out.println(couponCode);
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

	@PostConstruct
	public void init() {
		System.out.println("Init method called");
	}
	
	@PreDestroy
	public void destroy( ) {
		System.out.println("Destroy method called");
	}
}
