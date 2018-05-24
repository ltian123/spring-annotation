package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {

	@Pointcut("execution(* bean.*.*(..))")
	public void pointcutName(){}
	
	
	@Before("pointcutName()")
	public void before(JoinPoint jp){
		Object[] args=jp.getArgs();
		String methodName=jp.getSignature().getName();
		System.out.println("----方法"+methodName+"即将执行，参数个数："+args.length);
	}
	
	@AfterReturning(value="pointcutName()",returning="r")
	public void afterReturning(JoinPoint jp,Object r){
		String methodName=jp.getSignature().getName();
		System.out.println("----方法"+methodName+"已经返回，返回值是："+r);
	}
	
	@AfterThrowing(value="pointcutName()",throwing="e")
	public void afterThrowing(JoinPoint jp,Exception e){
		String methodName=jp.getSignature().getName();
		System.out.println("----方法"+methodName+"已经出错，异常对象是："+e);
	}
	
	@After("pointcutName()")
	public void after(){
		System.out.println("after");
	}
	
	@Around("pointcutName()")
	public Object time(ProceedingJoinPoint jp)throws Throwable {
		Object target=jp.getThis();
		String methodName=jp.getSignature().getName();
		Object[] args=jp.getArgs();
		
		
		Object result=null;
		long start=0;
		long end=0;
		
		try {
			System.out.println("开始");
			start=System.currentTimeMillis();
			
			result=jp.proceed();
			
			end=System.currentTimeMillis();
			System.out.println("结束");
			System.out.println(methodName+" "+(end-start));
		} catch (Exception e) {
			end=System.currentTimeMillis();
			System.out.println("出错");
			System.out.println(methodName+" "+(end-start));
			throw e;
		}
		
		return result;
		
		
		
	}
	
	
	
	
	
	
	
}
