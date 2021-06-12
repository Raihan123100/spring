package com.raihan.spring.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/raihan/spring/testspring/beans/beans.xml");

		patient p = (patient) context.getBean("patient");
		p.speck();
		System.out.println("Hello World!");
		System.out.println(p);

		//Address address = (Address) context.getBean("address");
		//System.out.println(address);

		((ClassPathXmlApplicationContext) context).close();

	}
}
