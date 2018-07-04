package spring.aspect.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import spring.aspect.dao.UserDao;

@Service(value="userService")
public class UserService {
	@Resource
	private UserDao userDao;

	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	
	public UserService() {
		super();
	}


	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public String toString() {
		return "UserService [userDao=" + userDao + "]";
	}
	
	public void doSth(){
		System.out.println("sevice层");
	}
}
