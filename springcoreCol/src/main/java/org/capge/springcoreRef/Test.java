package org.capge.springcoreRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
	       		 new ClassPathXmlApplicationContext("org/capge/springcoreRef/cfg.xml");
//		A temp =(A) context.getBean("aref");
//		System.out.println(temp.getX());
//		System.out.println(temp.getOb().getY());
			Example example =(Example) context.getBean("example");
			System.out.println(example);
	}

}
