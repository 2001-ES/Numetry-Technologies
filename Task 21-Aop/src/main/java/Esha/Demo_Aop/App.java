package Esha.Demo_Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Esha.Demo_Aop.service.Admission;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
        Admission admission = (Admission)context.getBean("add");
        admission.saveStudent(110);
        System.out.println("***********");
        admission.hostelAllocated();
    }
}
