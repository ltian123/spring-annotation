package bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class OtherBean {
//	@Value("abc")
//	private String str;
//	@Value("123")
//	private int var;
	
	
	@Value("${str}")
	private String str;
	@Value("${var}")
	private int var;
	
	public void doOther(){
		System.out.println(str);
		System.out.println(var);
	}
}
