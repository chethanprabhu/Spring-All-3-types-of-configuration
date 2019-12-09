package com.NOXMLconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		Car bmwCar = context.getBean("BMW", Car.class);
		bmwCar.startCar();
		bmwCar.getDiscountCode();
		bmwCar.displaySpecialCode();
		
		context.close();
	}

}
