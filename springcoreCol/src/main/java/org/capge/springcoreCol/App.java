package org.capge.springcoreCol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!.........spring collection" );
        ApplicationContext context =
       		 new ClassPathXmlApplicationContext("conf.xml");
//      Order order1=(Order) context.getBean("order1");
//        System.out.println(order1);
        
        //object fo employee class
        Emp emp=(Emp) context.getBean("emp");
        System.out.println(emp);
        System.out.println("==================================");
        System.out.println(emp.getName());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourses());
        System.out.println(emp.getPhones());
    }
}
