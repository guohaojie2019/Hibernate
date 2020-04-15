package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.UserService;
import model.Information;
import model.Lesson;

import com.opensymphony.xwork2.ModelDriven;

public class lessonAction  implements ModelDriven<Lesson>{
	
	Lesson lesson= new Lesson();
	private List<Lesson>lessonList =new ArrayList<Lesson>();
	
	
	
	public String lessonfind(){
		UserService userServ=new UserService();
		lessonList=userServ.lessonfind();
		HttpServletRequest request = ServletActionContext.getRequest();
	    Integer a=Integer.parseInt(request.getParameter("value")); 
		if (a==1) {
			return "selectlesson";
		}
		else {
			if (a==2) {
				return "teacherlesson";
			}
			else 
				return "success";
			
			
		}
		
	}
	
	public String lessonadd(){
		UserService userServ=new UserService();
		if(userServ.lessonadd(lesson))
		{	
			return "success";
		}
		return "fail";
	}
	public String lessondelete(){
		UserService userServ=new UserService();
		
		if(userServ.lessondelete(lesson))
		{	
			return "success";
		}
		return "fail";
	}
	public String lessonupdata(){
		UserService userServ=new UserService();
		
		if(userServ.lessonupdata(lesson))
		{	
			return "success";
		}
		return "fail";
	}


	
	
	public Lesson getLesson() {
		return lesson;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	public List<Lesson> getLessonList() {
		return lessonList;
	}
	public void setLessonList(List<Lesson> lessonList) {
		this.lessonList = lessonList;
	}
	public Lesson getModel() {
		// TODO Auto-generated method stub
		return lesson;
	}
	

}
