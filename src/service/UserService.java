package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import model.Information;
import model.InformationDAO;
import model.Lesson;
import model.LessonDAO;
import model.Score;
import model.ScoreDAO;
import model.Teacher;
import model.TeacherDAO;
import model.User;
import model.UserDAO;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;


public class UserService {
	
	InformationDAO informadao=new InformationDAO();
	TeacherDAO tdao=new TeacherDAO();
	LessonDAO ldao=new LessonDAO();
	ScoreDAO sdao=new ScoreDAO();
	
	
	public List<User> login(User user) {
		UserDAO dao = new UserDAO();
		String hql = "from User where account='"+user.getAccount()+"' and password = '" +user.getPassword()+"' and type = '" +user.getType()+"'";
		List<User> list = dao.findByHql(hql);
		return list;
	}
	public List<Information> informfind(){
		return informadao.findAll();
	}
	public boolean informadd(Information informa ){
		informadao.save(informa);
		   return true;
		}
	public boolean informdelete(Information informa ){
		informadao.delete(informa);
		   return true;
		}
		public boolean informupdate(Information informa ){
			informadao.attachDirty(informa);
			   return true;
			}

		public Information informupdataview(Integer studentId ){//
					
					
					   return informadao.findById(studentId);
					}
	
	
		
		public List<Teacher> teacherfind(){
			return tdao.findAll();
		}
		public boolean teacheradd(Teacher tea ){
			tdao.save(tea);
			   return true;
			}
		public boolean teacherdelete(Teacher tea ){
			tdao.delete(tea);
			   return true;
			}
		public boolean teacherupdate(Teacher tea ){
				tdao.attachDirty(tea);
				   return true;
			}
		
			
			
			
			
		public List<Lesson> lessonfind(){
				return ldao.findAll();
			}
		public boolean lessonadd(Lesson tea ){
			ldao.save(tea);
			   return true;
			}
		public boolean lessondelete(Lesson tea ){
			ldao.delete(tea);
			   return true;
			}
		public boolean lessonupdata(Lesson tea ){
			ldao.attachDirty(tea);
				   return true;
			}
		
		
		
		
		
		public List<Score> Scorefind(){
			return sdao.findAll();
		}
		public boolean scoreadd(Score tea){
			
			sdao.save(tea);
			   return true;
			}
		public boolean scoredelete(Score tea ){
			sdao.delete(tea);
			   return true;
			}
		public boolean scoreupdata(Score tea ){
			System.out.print(tea.getScore()+"<---service--->");
			sdao.attachDirty(tea);
				   return true;
			}	
			

	
}
	
