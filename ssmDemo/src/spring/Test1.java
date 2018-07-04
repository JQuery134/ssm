package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.factory.InterfaceColor;

public class Test1 {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
		/*Student s=(Student) applicationContext.getBean("student");
		System.out.println(s.toString());*/
		InterfaceColor color=(InterfaceColor) applicationContext.getBean("color");
		color.fill();
	}

}
