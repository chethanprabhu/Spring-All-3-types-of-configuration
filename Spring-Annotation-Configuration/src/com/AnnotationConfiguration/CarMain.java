package com.AnnotationConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //If name is applicationContext then no need to specify
		Car bmwCar = context.getBean("BMWBEAN", Car.class);
		bmwCar.startCar();
		bmwCar.stopCar();
		bmwCar.getDiscountCode();	
		bmwCar.displaySpecialCode();
		
		Car ferrariCar = context.getBean("ferrari", Car.class);
		ferrariCar.startCar();
		ferrariCar.stopCar();
		ferrariCar.getDiscountCode();
		context.close();
	}
}
