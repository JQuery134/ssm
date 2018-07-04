package spring.aspect.dao;

import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDao {
	
	public UserDao() {
		super();
	}

	public void doSth(){
		System.out.println("dao层");
	}
}
