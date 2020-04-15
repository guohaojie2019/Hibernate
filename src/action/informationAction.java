package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import model.Information;
import service.UserService;

public class informationAction implements ModelDriven<Information>{
	private Map<String, Object>request,session;//
	Information informa= new Information();
	private List<Information>informtionList =new ArrayList<Information>();
	
	
	
	public String informfind(){
		UserService userServ=new UserService();
		informtionList=userServ.informfind();
		return "success";
	}
	public String informadd(){
		UserService userServ=new UserService();
		System.out.print(informa.getName());
		if(userServ.informadd(informa))
		{	
			return "success";
		}
		return "fail";
	}
	public String informdelete(){
		UserService userServ=new UserService();
		
		if(userServ.informdelete(informa))
		{	
			return "success";
		}
		return "fail";
	}
	public String informupdata(){
		UserService userServ=new UserService();
		
		if(userServ.informupdate(informa))
		{	
			return "success";
		}
		return "fail";
	}
public String informupdataview(){//
		
		ActionContext ctx = ActionContext.getContext();
		request = (Map)ctx.get("request");
		HttpServletRequest request1 = ServletActionContext.getRequest();
		 Integer studentId=Integer.parseInt(request1.getParameter("studentId")); 
		UserService userServ=new UserService();
		Information instance =userServ.informupdataview(studentId);
		request.put("stu",instance);
			
			return "success";
		
	}
	
	
	
	
	public void setInformtionList(List<Information> informtionList) {
		this.informtionList = informtionList;
	}
	public List<Information> getInformtionList() {
		return informtionList;
	}
	public Information getModel() {
		// TODO Auto-generated method stub
		return informa;
	}
	public Information getInforma() {
		return informa;
	}
	public void setInforma(Information informa) {
		this.informa = informa;
	}

}
