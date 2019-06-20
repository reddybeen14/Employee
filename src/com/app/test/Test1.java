package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Employee;
import com.app.config.AppConfig;

public class Test1 {
	public static void main(String[] args) {
		
	
	ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
	Employee ee=ac.getBean("empobj",Employee.class);
	
	System.out.println(ee);
}
}
	