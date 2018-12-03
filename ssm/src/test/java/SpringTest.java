import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import ssmDemo.bean.Student;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context1.equals(context2));
        Student student = (Student)context1.getBean("student");
        System.out.println(student.toString());
    }
}
