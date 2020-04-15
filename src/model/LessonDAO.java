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
 * Lesson entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see model.Lesson
 * @author MyEclipse Persistence Tools
 */

public class LessonDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(LessonDAO.class);
	// property constants
	public static final String LESSON_NAME = "lessonName";
	public static final String TEACHER_ID = "teacherId";

	public void save(Lesson transientInstance) {
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

	public void delete(Lesson persistentInstance) {
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

	public Lesson findById(java.lang.Integer id) {
		log.debug("getting Lesson instance with id: " + id);
		try {
			Lesson instance = (Lesson) getSession().get("model.Lesson", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Lesson instance) {
		log.debug("finding Lesson instance by example");
		try {
			List results = getSession().createCriteria("model.Lesson").add(
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
		log.debug("finding Lesson instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Lesson as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLessonName(Object lessonName) {
		return findByProperty(LESSON_NAME, lessonName);
	}

	public List findByTeacherId(Object teacherId) {
		return findByProperty(TEACHER_ID, teacherId);
	}

	public List findAll() {
		log.debug("finding all Lesson instances");
		try {
			String queryString = "from Lesson";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Lesson merge(Lesson detachedInstance) {
		log.debug("merging Lesson instance");
		try {
			Lesson result = (Lesson) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Lesson instance) {
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
		  Lesson t = (Lesson) session.get(Lesson.class, instance.getLessonId());
			t.setLessonName(instance.getLessonName());
			t.setTeacherId(instance.getTeacherId());
			session.update(t);
		  // 提交事务
		  transaction.commit();
		  session.close();
		  sessionFactory.close();
	}

	public void attachClean(Lesson instance) {
		log.debug("attaching clean Lesson instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}