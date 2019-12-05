package com.XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car BMWcar = applicationContext.getBean("BMW",Car.class);
		Car FerrariCar = applicationContext.getBean("Ferrari", Car.class);
		
		BMWcar.startCar();
		FerrariCar.stopCar();
		BMWcar.getDiscountCode();
		FerrariCar.getDiscountCode();
		
		applicationContext.close();
 	}

}
