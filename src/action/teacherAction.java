package action;

import java.util.ArrayList;
import java.util.List;

import service.UserService;
import model.Information;
import model.Teacher;

import com.opensymphony.xwork2.ModelDriven;

public class teacherAction  implements ModelDriven<Teacher>{
	
	Teacher tea=new Teacher();
	private List<Teacher>TeacherList =new ArrayList<Teacher>();
	
	
	
	public String Teacherfind(){
		UserService userServ=new UserService();
		TeacherList=userServ.teacherfind();
		return "success";
	}
	public String Teacheradd(){
		UserService userServ=new UserService();
		if(userServ.teacheradd(tea))
		{	
			return "success";
		}
		return "fail";
	}
	public String Teacherdelete(){
		UserService userServ=new UserService();
		
		if(userServ.teacherdelete(tea))
		{	
			return "success";
		}
		return "fail";
	}
	public String Teacherupdata(){
		UserService userServ=new UserService();
		
		if(userServ.teacherupdate(tea))
		{	
			return "success";
		}
		return "fail";
	}
	
	
	
	
	
	
	
	public List<Teacher> getTeacherList() {
		return TeacherList;
	}
	public void setTeacherList(List<Teacher> teacherList) {
		TeacherList = teacherList;
	}
	public Teacher getTea() {
		return tea;
	}
	public void setTea(Teacher tea) {
		this.tea = tea;
	}
	public Teacher getModel() {
		// TODO Auto-generated method stub
		return tea;
	}

}
