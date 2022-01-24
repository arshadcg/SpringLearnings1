package com.company.learnings;

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
    	
    	ApplicationContext contexts = new ClassPathXmlApplicationContext("beans.xml");
    	
		/*
		 * Vehicle obj = (Vehicle)contexts.getBean("brakes");
		 * 
		 * obj.drive();
		 */
    	
    	
    	tyre t  = (tyre) contexts.getBean("tyre");
    	
    	System.out.println(t);
    	
        
     }
}
  