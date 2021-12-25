/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.tutv.dao.TruongThptDAO;
import com.tutv.entity.TruongThpt;
import com.tutv.response.TruongThptResponse;

/**
 * TruongThptDAO
 */
@Transactional
public class TruongThptDAOImpl implements TruongThptDAO {
	/**
	 * Property sessionFactory
	 */
	private SessionFactory sessionFactory;
	
	/**
	 * setSessionFactory
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * findTruongThptById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public TruongThpt findTruongThptById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<TruongThpt> query = builder.createQuery(TruongThpt.class);
		Root<TruongThpt> root = query.from(TruongThpt.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		TruongThpt khoa = session.createQuery(query).setMaxResults(1).uniqueResult();
		return khoa;
	}

	/**
	 * getTruongThptById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public TruongThptResponse getTruongThptById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<TruongThptResponse> query = builder.createQuery(TruongThptResponse.class);
		Root<TruongThptResponse> root = query.from(TruongThptResponse.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		TruongThptResponse khoa = session.createQuery(query).setMaxResults(1).uniqueResult();
		return khoa;
	}

	/**
	 * createTruongThpt
	 *
	 * @param khoa
	 * @return
	 */
	@Override
	public TruongThpt createTruongThpt(TruongThpt khoa) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Serializable id = session.save(khoa);
			tx.commit();
			if (session != null) {
				session.close();
			}
			khoa = findTruongThptById((Integer) id);
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			if (session != null) {
				session.close();
			}
			return null;
		}
		
		return khoa;
	}

	/**
	 * updateTruongThpt
	 *
	 * @param khoa
	 * @return
	 */
	@Override
	public TruongThpt updateTruongThpt(TruongThpt khoa) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(khoa);
			tx.commit();
			if (session != null) {
				session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			if (session != null) {
				session.close();
			}
			return null;
		}
		
		return khoa;
	}

	/**
	 * destroyTruongThpt
	 *
	 * @param TruongThpt
	 * @return
	 */
	@Override
	public boolean destroyTruongThpt(TruongThpt khoa) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.delete(khoa);
			tx.commit();
			if (session != null) {
				session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			return false;
		}
		return true;
	}

	/**
	 * getListTruongThpt
	 *
	 * @return
	 */
	@Override
	public List<TruongThptResponse> getListTruongThpt() {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<TruongThptResponse> query = builder.createQuery(TruongThptResponse.class);
		Root<TruongThptResponse> root = query.from(TruongThptResponse.class);
		//Predicate p = builder.equal(root.get("id"), id);
		query.select(root);
		List<TruongThptResponse> khoalist = session.createQuery(query).getResultList();
		return khoalist;
	}
}
