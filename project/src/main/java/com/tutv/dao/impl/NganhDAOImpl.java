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

import com.tutv.dao.NganhDAO;
import com.tutv.entity.Nganh;
import com.tutv.response.NganhResponse;

/**
 * NganhDAO
 */
@Transactional
public class NganhDAOImpl implements NganhDAO{
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
	 * findNganhById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Nganh findNganhById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Nganh> query = builder.createQuery(Nganh.class);
		Root<Nganh> root = query.from(Nganh.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		Nganh khoa = session.createQuery(query).setMaxResults(1).uniqueResult();
		return khoa;
	}

	/**
	 * getNganhById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public NganhResponse getNganhById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<NganhResponse> query = builder.createQuery(NganhResponse.class);
		Root<NganhResponse> root = query.from(NganhResponse.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		NganhResponse khoa = session.createQuery(query).setMaxResults(1).uniqueResult();
		return khoa;
	}

	/**
	 * createNganh
	 *
	 * @param khoa
	 * @return
	 */
	@Override
	public Nganh createNganh(Nganh khoa) {
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
			khoa = findNganhById((Integer) id);
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
	 * updateNganh
	 *
	 * @param khoa
	 * @return
	 */
	@Override
	public Nganh updateNganh(Nganh khoa) {
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
	 * destroyNganh
	 *
	 * @param Nganh
	 * @return
	 */
	@Override
	public boolean destroyNganh(Nganh khoa) {
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
	 * getListNganh
	 *
	 * @return
	 */
	@Override
	public List<NganhResponse> getListNganh() {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<NganhResponse> query = builder.createQuery(NganhResponse.class);
		Root<NganhResponse> root = query.from(NganhResponse.class);
		//Predicate p = builder.equal(root.get("id"), id);
		query.select(root);
		List<NganhResponse> khoalist = session.createQuery(query).getResultList();
		return khoalist;
	}
	/**
	 * getListNganhByKhoa
	 *
	 * @param idKhoa
	 * @return
	 */
	@Override
	public List<NganhResponse> getListNganhByKhoa(Integer idKhoa) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<NganhResponse> query = builder.createQuery(NganhResponse.class);
		Root<NganhResponse> root = query.from(NganhResponse.class);
		Predicate p = builder.equal(root.get("idKhoa"), idKhoa);
		query.select(root).where(p);
		List<NganhResponse> khoalist = session.createQuery(query).getResultList();
		return khoalist;
	}
}

