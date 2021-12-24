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

import com.tutv.dao.KhoaDAO;
import com.tutv.entity.Khoa;
import com.tutv.response.KhoaResponse;

/**
 * KhoaDAO
 */
@Transactional
public class KhoaDAOImpl implements KhoaDAO{
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
	 * findKhoaById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Khoa findKhoaById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Khoa> query = builder.createQuery(Khoa.class);
		Root<Khoa> root = query.from(Khoa.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		Khoa khoa = session.createQuery(query).setMaxResults(1).uniqueResult();
		return khoa;
	}

	/**
	 * getKhoaById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public KhoaResponse getKhoaById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<KhoaResponse> query = builder.createQuery(KhoaResponse.class);
		Root<KhoaResponse> root = query.from(KhoaResponse.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		KhoaResponse khoa = session.createQuery(query).setMaxResults(1).uniqueResult();
		return khoa;
	}

	/**
	 * createKhoa
	 *
	 * @param khoa
	 * @return
	 */
	@Override
	public Khoa createKhoa(Khoa khoa) {
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
			khoa = findKhoaById((Integer) id);
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
	 * updateKhoa
	 *
	 * @param khoa
	 * @return
	 */
	@Override
	public Khoa updateKhoa(Khoa khoa) {
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
	 * destroyKhoa
	 *
	 * @param Khoa
	 * @return
	 */
	@Override
	public boolean destroyKhoa(Khoa khoa) {
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
	 * getListKhoa
	 *
	 * @return
	 */
	@Override
	public List<KhoaResponse> getListKhoa() {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<KhoaResponse> query = builder.createQuery(KhoaResponse.class);
		Root<KhoaResponse> root = query.from(KhoaResponse.class);
		//Predicate p = builder.equal(root.get("id"), id);
		query.select(root);
		List<KhoaResponse> khoalist = session.createQuery(query).getResultList();
		return khoalist;
	}
}
