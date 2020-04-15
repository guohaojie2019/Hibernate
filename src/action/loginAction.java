package action;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.If;

import model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;


import service.UserService;

public class loginAction implements ModelDriven<User>{
	
	private User user=new User();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login() {
		java.util.Map<String, Object> session = ActionContext.getContext().getSession();	    
		HttpServletRequest request = ServletActionContext.getRequest();
	    String studentId=request.getParameter("account"); 
	    session.put("account", studentId);
			UserService userService = new UserService();
			
			if(userService.login(user).isEmpty())
				return "fail";
			else{
				if(user.getType().equals(1))
					return "student";
				else {
					if (user.getType().equals(2)) {
						return "teacher";
					}
					else {
						return "admin";
						
					}
				}
				
					
			}
		}
	
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
