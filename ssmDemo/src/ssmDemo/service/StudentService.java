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
		// TODO Auto-generated method stub
		studentDao.addStudent(student);
	}
	
}
