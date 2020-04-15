package model;

import dao.BaseHibernateDAO;
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
 * Teacher entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see model.Teacher
 * @author MyEclipse Persistence Tools
 */

public class TeacherDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TeacherDAO.class);
	// property constants
	public static final String TEACHER_NAME = "teacherName";
	public static final String SEX = "sex";
	public static final String ADDRESS = "address";

	public void save(Teacher transientInstance) {
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

	public void delete(Teacher persistentInstance) {
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

	public Teacher findById(java.lang.Integer id) {
		log.debug("getting Teacher instance with id: " + id);
		try {
			Teacher instance = (Teacher) getSession().get("model.Teacher", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Teacher instance) {
		log.debug("finding Teacher instance by example");
		try {
			List results = getSession().createCriteria("model.Teacher").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Teacher instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Teacher as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTeacherName(Object teacherName) {
		return findByProperty(TEACHER_NAME, teacherName);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findAll() {
		log.debug("finding all Teacher instances");
		try {
			String queryString = "from Teacher";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Teacher merge(Teacher detachedInstance) {
		log.debug("merging Teacher instance");
		try {
			Teacher result = (Teacher) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Teacher instance) {
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
		  Teacher t = (Teacher) session.get(Teacher.class, instance.getTeacherId());
			t.setTeacherName(instance.getTeacherName());
			t.setSex(instance.getSex());
			t.setAddress(instance.getAddress());
			session.update(t);
		  // 提交事务
		  transaction.commit();
		  session.close();
		  sessionFactory.close();
	}

	public void attachClean(Teacher instance) {
		log.debug("attaching clean Teacher instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}