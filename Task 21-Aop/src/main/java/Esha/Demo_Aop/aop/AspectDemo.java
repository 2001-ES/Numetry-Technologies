package Esha.Demo_Aop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectDemo {

	@Before("execution(* Esha.Demo_Aop.service.Admission.*(..))")
	public void logBeforeExecution() {
		System.out.println("** Student admission is being started from ASPECT");
		
	}
	@After("execution(* Esha.Demo_Aop.service.Admission.*(..))")
	public void logAfterExecution() {
		System.out.println("** Student admission saved from ASPECT");
}
}