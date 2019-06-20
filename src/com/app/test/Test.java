package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Employee ee=ac.getBean("empobj",Employee.class);
		System.out.println(ee);
		System.out.println(ee);
	}
}
