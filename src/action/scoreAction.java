package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.Lesson;
import model.Score;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class scoreAction  implements ModelDriven<Score>{
	
	Score score= new Score();
	private List<Score>scoreList =new ArrayList<Score>();
	
	
	
	public String scorefind(){
		UserService userServ=new UserService();
		scoreList=userServ.Scorefind();
		HttpServletRequest request = ServletActionContext.getRequest();
	    Integer a=Integer.parseInt(request.getParameter("value"));
		if (a==1) {
			return "teacher";
		}else if (a==2) {
			return "success";
		}
		return "success";
		
	}
	public String scoreadd(){
		java.util.Map<String, Object> session = ActionContext.getContext().getSession();
		HttpServletRequest request = ServletActionContext.getRequest();
	    Integer lessonId=Integer.parseInt(request.getParameter("a"));
	    System.out.println(lessonId+"lessonId+Scor+action");
	    String s=(String)session.get("account");
	    
	    Score score= new Score();
	    score.setScoreId(10);
	    score.setStudentId(Integer.parseInt(s));
	    score.setIessonId(lessonId);
		UserService userServ=new UserService();
		if(userServ.scoreadd(score))
		{	
			return "success";
		}
		return "fail";
	}
	public String scoredelete(){
		UserService userServ=new UserService();
		
		if(userServ.scoredelete(score))
		{	
			return "success";
		}
		return "fail";
	}
	
	
	public String scoreupdata1(){
java.util.Map<String, Object> session = ActionContext.getContext().getSession();

		HttpServletRequest request = ServletActionContext.getRequest();
	    String scoreId=request.getParameter("a");
	    String studentId=request.getParameter("b");
	    String iessonId=request.getParameter("c");
	    session.put("a", scoreId);
	    session.put("b", studentId);
	    session.put("c", iessonId);
	    
	    
	    
			return "success";
		
	}
	public String scoreupdata(){
		java.util.Map<String, Object> session = ActionContext.getContext().getSession();
		UserService userServ=new UserService();
		HttpServletRequest request = ServletActionContext.getRequest();
	    Integer score=Integer.parseInt(request.getParameter("score"));
	    
	    String a=(String)session.get("a");
	    String b=(String)session.get("b");
	    String c=(String)session.get("c");
	    
	    
	    Score ss= new Score();
	    ss.setScoreId(Integer.parseInt(a));
	    ss.setStudentId(Integer.parseInt(b));
	    ss.setIessonId(Integer.parseInt(c));
	    ss.setScore(score);
		if(userServ.scoreupdata(ss))
		{	
			return "success";
		}
		return "fail";
	}

	
	
	
	
	
	
	
	
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public List<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(List<Score> scoreList) {
		this.scoreList = scoreList;
	}
	public Score getModel() {
		// TODO Auto-generated method stub
		return score;
	}
}
