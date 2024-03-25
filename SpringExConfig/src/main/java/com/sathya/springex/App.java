package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedconfig.class);
       Patient patient = context.getBean("patient",Patient.class);
       patient.details();
    }
}
