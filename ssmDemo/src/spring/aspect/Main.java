package spring.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aspect.action.UserAction;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/aspect/spring.xml");
		UserAction userAction = (UserAction) applicationContext.getBean("userAction");
		UserAction userAction1 = (UserAction) applicationContext.getBean("userAction");
		System.out.println(userAction==userAction1);
		userAction.doSth();
	}

}	
