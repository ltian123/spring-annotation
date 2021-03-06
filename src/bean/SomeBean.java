package bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service
//@Scope("prototype")
//@Lazy
@Lazy(false)
public class SomeBean {
	
//	@Autowired
//	private OtherBean otherBean;
	
//	@Autowired
//	@Qualifier("ob")
//	private OtherBean otherBean;
	
//	@Resource
//	private OtherBean otherBean;
	
	@Resource(name="ob")
	private OtherBean otherBean;
	
	
	public SomeBean() {
//		System.out.println("SomeBean.SomeBean()");
	}
	
	public void doSome(){
		System.out.println(otherBean);
	}
	
	public void f(){
		System.out.println("SomeBean.f()");
	}
	
//	@PostConstruct
	public void a(){
		System.out.println("a");
	}
	
//	@PreDestroy
	public void b(){
		System.out.println("b");
	}
	
	
	
	
	
	
}
