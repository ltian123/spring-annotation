package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.OtherBean;
import bean.SomeBean;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext ac=new AnnotationConfigApplicationContext("bean");
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		System.out.println("----------------------------------------");
		
		SomeBean someBean=(SomeBean) ac.getBean("someBean");
		
//		System.out.println(someBean);
		
		someBean.f();
		
		
//		SomeBean someBean1=(SomeBean) ac.getBean("someBean");
//		
//		System.out.println(someBean1);
//		
//		
//		SomeBean someBean2=(SomeBean) ac.getBean("someBean");
//		
//		System.out.println(someBean2);
		
		
//		someBean.doSome();
//		
//		OtherBean otherBean=(OtherBean) ac.getBean("ob");
//		
//		System.out.println(otherBean);
//		
//		otherBean.doOther();
//		
//		
//		ac.destroy();
	}
}
