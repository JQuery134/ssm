package spring.aspect.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import spring.aspect.service.UserService;

@Controller(value="userAction")
@Scope(value="session")
public class UserAction {
	@Resource
	private UserService userService;

	public UserAction(UserService userService) {
		super();
		this.userService = userService;
	}
	

	public UserAction() {
		super();
	}


	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void doSth(){
		System.out.println("action层");
	}
}
