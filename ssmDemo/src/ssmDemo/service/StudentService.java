package ssmDemo.service;

import ssmDemo.bean.Student;
import ssmDemo.dao.StudentDao;

public class StudentService {
	
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}
	
}
