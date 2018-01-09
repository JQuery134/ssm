package ssmDemo.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ssmDemo.bean.Student;
import ssmDemo.service.StudentService;

@Controller
@RequestMapping(value="/student")
public class StudentAction {
	
	private static Logger logger = Logger.getLogger(StudentAction.class);
	@Resource(name="studentService")
	private StudentService studentService;
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value="/addStudent")
	public void addStudent(){
		Student student=new Student(20,"bao",2);
		studentService.addStudent(student);
		logger.info("°ü»ª½Ü+++++++++++++++++");
	}
	
}
