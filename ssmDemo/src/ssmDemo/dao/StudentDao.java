package ssmDemo.dao;

import org.mybatis.spring.SqlSessionTemplate;

import ssmDemo.bean.Student;

public class StudentDao {
	
	private SqlSessionTemplate sqlSessionTemplate;
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public void addStudent(Student student){
		int i=sqlSessionTemplate.insert("ssmDemo.bean.StudentMapper.addStudent", student);
	}
}

