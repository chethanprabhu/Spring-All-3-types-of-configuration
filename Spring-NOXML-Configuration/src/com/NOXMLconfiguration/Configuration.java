package com.NOXMLconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.NOXMLconfiguration")
@PropertySource("classpath:specialCode.properties")
public class Configuration {
	
	@Value("${SPECIALCODE}")
	String couponCode;
	
	@Autowired
	Environment env;
	
	@Bean
	public DiscountCoupon BMWdiscountBean() {
		BMWdiscount obj = new BMWdiscount();
		return obj;
	}
	
	@Bean
	public DiscountCoupon FerrariDiscountBean() {
		FerrariDiscount obj = new FerrariDiscount();
		return obj;
	}
	
	@Bean
	public Car BMW() {
		BMW obj = new BMW(BMWdiscountBean());
		//obj.setCouponCode(couponCode); <-- Even this works fine. But Env is better because of profiles.
		obj.setCouponCode(env.getProperty("SPECIALCODE"));
		return obj;
	}
	
	@Bean
	public Car Ferrari() {
		Ferrari obj = new Ferrari(); 
		obj.setFerrariDiscount(FerrariDiscountBean());
		return obj;
	}
	
}
