package model;

import dao.BaseHibernateDAO;
import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Information entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see model.Information
 * @author MyEclipse Persistence Tools
 */

public class InformationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(InformationDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String SEX = "sex";
	public static final String ADDRESS = "address";

	public void save(Information transientInstance) {
		Configuration configuration = new Configuration().configure();
		  // 创建会话工厂
		  SessionFactory sessionFactory = configuration.buildSessionFactory();
		  // 创建会话
		  Session session = sessionFactory.openSession();
		  // 开启事务
		  Transaction transaction = session.beginTransaction();
		 // HttpServletRequest request = ServletActionContext.getRequest();
	      // 取值
		//  Integer a=Integer.parseInt(request.getParameter("loginUser.customer.customerId")); 
		 
		  session.save(transientInstance);
		  // 提交事务
		  transaction.commit();
		  session.close();
		  sessionFactory.close();
	}

	public void delete(Information persistentInstance) {
		Configuration configuration = new Configuration().configure();
		  // 创建会话工厂
		  SessionFactory sessionFactory = configuration.buildSessionFactory();
		  // 创建会话
		  Session session = sessionFactory.openSession();
		  // 开启事务
		  Transaction transaction = session.beginTransaction();
		 // HttpServletRequest request = ServletActionContext.getRequest();
	      // 取值
		//  Integer a=Integer.parseInt(request.getParameter("loginUser.customer.customerId")); 
		 
		  session.delete(persistentInstance);
		  // 提交事务
		  transaction.commit();
		  session.close();
		  sessionFactory.close();
	}

	public Information findById(java.lang.Integer id) {
		log.debug("getting Information instance with id: " + id);
		try {
			Information instance = (Information) getSession().get(
					"model.Information", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Information instance) {
		log.debug("finding Information instance by example");
		try {
			List results = getSession().createCriteria("model.Information")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Information instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Information as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findAll() {
		log.debug("finding all Information instances");
		try {
			String queryString = "from Information";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Information merge(Information detachedInstance) {
		log.debug("merging Information instance");
		try {
			Information result = (Information) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	
	public void attachDirty(Information informa) {
		  Configuration configuration = new Configuration().configure();
		  // 创建会话工厂
		  SessionFactory sessionFactory = configuration.buildSessionFactory();
		  // 创建会话
		  Session session = sessionFactory.openSession();
		  // 开启事务
		  Transaction transaction = session.beginTransaction();
		  //编写HQL语句(面向类和属性的查询 
		  Information instance = (Information) session.get(Information.class, informa.getStudentId());
			instance.setName(informa.getName());
			instance.setSex(informa.getSex());
			instance.setData(informa.getData());
			instance.setAddress(informa.getAddress());
			session.update(instance);
			transaction.commit();
			session.close();
			sessionFactory.close();
	}
	
	public void attachClean(Information instance) {
		log.debug("attaching clean Information instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}