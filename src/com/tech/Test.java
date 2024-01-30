package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//ApplicationContext ctx =new ClassPathXmlApplicationContext("bean.xml");
		
		ConfigurableApplicationContext ctx =new ClassPathXmlApplicationContext("bean.xml");
		
		 Student s1= (Student) ctx.getBean("s1");
		 
		 System.out.println(s1.getId());
		 System.out.println(s1.getName());
		 
         ctx.close();
	}

}
