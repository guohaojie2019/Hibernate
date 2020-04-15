package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import action.HibernateUtil;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {

	public Session getSession() {
		// TODO Auto-generated method stub

		//Transaction transaction;
		    Configuration configuration = new Configuration().configure();
		    SessionFactory   sessionFactory = configuration.buildSessionFactory();
		    
		    return sessionFactory.openSession();
	}
	

	//public Session getSession() {
	//	return HibernateUtil.getSession();
	//}
	
	
}