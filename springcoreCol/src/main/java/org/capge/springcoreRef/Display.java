package org.capge.springcoreRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display {
	public static void main(String[] args) {
	ApplicationContext context=
				new ClassPathXmlApplicationContext("cfg.xml");
		
	Student student = context.getBean("student", Student.class);
	System.out.println(student);
	System.out.println(student.getAddress());
	System.out.println(student.getCity());
	
	((AbstractApplicationContext) context).close();
	}
}
