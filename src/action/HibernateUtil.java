package action;

import org.apache.commons.lang.xwork.ObjectUtils.Null;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.bcel.internal.generic.RETURN;



public class HibernateUtil {

	Transaction transaction;
	    Configuration configuration = new Configuration().configure();
	    SessionFactory   sessionFactory = configuration.buildSessionFactory();
	    
	   
	    
	    public  Session getSession() {
	        return sessionFactory.openSession();
	    }
	    public Transaction getTransaction() {
	    	transaction =sessionFactory.openSession().beginTransaction();
	    	return transaction;
		}
	   
	    public  void closeSession(Session session) {
	        if (session != null) {
	            if (session.isOpen()) {
	                session.close();
	                sessionFactory.close();
	            }
	        }
	    }
	}