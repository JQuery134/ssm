package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssmDemo.bean.Student;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
    }
}
