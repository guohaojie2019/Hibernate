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
 * A data access object (DAO) providing persistence and search support for Score
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see model.Score
 * @author MyEclipse Persistence Tools
 */

public class ScoreDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(ScoreDAO.class);
	// property constants
	public static final String STUDENT_ID = "studentId";
	public static final String IESSON_ID = "iessonId";
	public static final String SCORE = "score";

	public void save(Score transientInstance) {
		Configuration configuration = new Configuration().configure();
		  // 创建会话工厂
		  SessionFactory sessionFactory = configuration.buildSessionFactory();
		  // 创建会
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

	public void delete(Score persistentInstance) {
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

	public Score findById(java.lang.Integer id) {
		log.debug("getting Score instance with id: " + id);
		try {
			Score instance = (Score) getSession().get("model.Score", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Score instance) {
		log.debug("finding Score instance by example");
		try {
			List results = getSession().createCriteria("model.Score").add(
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
		log.debug("finding Score instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Score as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStudentId(Object studentId) {
		return findByProperty(STUDENT_ID, studentId);
	}

	public List findByIessonId(Object iessonId) {
		return findByProperty(IESSON_ID, iessonId);
	}

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findAll() {
		log.debug("finding all Score instances");
		try {
			String queryString = "from Score";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Score merge(Score detachedInstance) {
		log.debug("merging Score instance");
		try {
			Score result = (Score) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Score instance) {
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
		  Score t = (Score) session.get(Score.class, instance.getScoreId());
			t.setScore(instance.getScore());
			System.out.print(t.getScore()+"dao");
			session.update(t);
		  // 提交事务
		  transaction.commit();
		  session.close();
		  sessionFactory.close();
	}

	public void attachClean(Score instance) {
		log.debug("attaching clean Score instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}