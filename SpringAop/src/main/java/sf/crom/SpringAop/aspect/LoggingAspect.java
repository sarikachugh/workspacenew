package sf.crom.SpringAop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import sf.crom.SpringAop.model.Circle;

/*@Aspect*/
public class LoggingAspect {
	
	/*@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
		
		//Circle circle = (Circle) joinPoint.getTarget();
		
		
		//System.out.println(joinPoint.toString());
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethods(String name, String returnString) {
		System.out.println("A method that takes String arguments has been called, The value is " + name + " The output values is " + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, RuntimeException ex) {
		System.out.println("An exception has been thrown " + ex);
	}
	
	/*@Around("@annotation(sf.crom.SpringAop.aspect.Loggable)")
	public Object myAroundadvice(ProceedingJoinPoint proceedingJoinPoint){
		
		Object returnValue = null;
		
		try {
			
			
			System.out.println("Before advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
			System.out.println("After Finally");
			return returnValue;
	}*/
	
	/*@Around("allGetters()")*/
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		
		Object returnValue = null;
		
		try {
			
			
			System.out.println("Before advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
			System.out.println("After Finally");
			return returnValue;
	}
	
	public void loggingAdvice(){
		System.out.println("Logging from the advice");		
	}
	
	/*@Pointcut("execution(* get*())")
	public void allGetters() {}*/
	
	//public void exceptionAdvice(String name, Exception ex)
	
	//public void stringArgumentMethods(String name, Object returnString)
	
	/*@AfterReturning("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("A method that takes String arguments has been called, The value is " +name);
	}*/
	
	/*@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		System.out.println("An exception has been thrown");
	}*/
	
	//@After("args(name)")
	
	/*@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("A method that takes String arguments has been called, The value is " +name);
	}*/
	
	/*@Before("args(String)")
	public void stringArgumentMethods() {
		System.out.println("A method that takes String arguments has been called");
	}*/
	
	/*@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice() {
		System.out.println("Advice run. Get Method called");
		
	}*/
	
	/*@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice executed.");
		
	}*/
	
	/*@Pointcut("execution(* get*())")
	public void allGetters() {}*/
	
	//@Pointcut("execution(* sf.crom.SpringAop.service.*Service.*(..))")
	
	/*@Pointcut("within(sf.crom.SpringAop.model.Circle)")
	public void allCircleMethods() {}*/
	
	//@Pointcut(args())
}


//@Before("execution(* sf.crom.SpringAop.model.*.get*())")
//@Before("execution(public String sf.crom.SpringAop.model.Circle.getName())")
//@Before("execution( * get*(*))")
//@Before("execution( * get*(..))")
//@Before("execution( * get*())")
//@Before("execution(public * get*())")

//@Pointcut("execution(* * sf.crom.SpringAop.model.Circle.*(..))")
//@Pointcut("within(sf.crom.SpringAop.model.*)")  --apply to all classes/methods within the package
//@Pointcut("within(sf.crom.SpringAop.model..*)") --apply to all subpackages within package
//@Before("allCircleMethods()")