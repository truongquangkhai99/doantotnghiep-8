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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tutv.dao.NguyenVongDAO;
import com.tutv.entity.NguyenVong;
import com.tutv.response.NguyenVongResponse;
import com.tutv.service.HoSoXetTuyenService;

/**
 * NguyenVongDAO
 */
@Transactional
public class NguyenVongDAOImpl implements NguyenVongDAO{
	
	@Autowired HoSoXetTuyenService hoSoXetTuyenService;
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
	 * findNguyenVongById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public NguyenVong findNguyenVongById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<NguyenVong> query = builder.createQuery(NguyenVong.class);
		Root<NguyenVong> root = query.from(NguyenVong.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		NguyenVong nguyenVong = session.createQuery(query).setMaxResults(1).uniqueResult();
		return nguyenVong;
	}

	/**
	 * getNguyenVongById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public NguyenVongResponse getNguyenVongById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<NguyenVongResponse> query = builder.createQuery(NguyenVongResponse.class);
		Root<NguyenVongResponse> root = query.from(NguyenVongResponse.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		NguyenVongResponse nguyenVong = session.createQuery(query).setMaxResults(1).uniqueResult();
		return nguyenVong;
	}

	/**
	 * createNguyenVong
	 *
	 * @param nguyenVong
	 * @return
	 */
	@Override
	public NguyenVong createNguyenVong(NguyenVong nguyenVong) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Serializable id = session.save(nguyenVong);
			tx.commit();
			if (session != null) {
				session.close();
			}
			nguyenVong = findNguyenVongById((Integer) id);
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
		
		return nguyenVong;
	}

	/**
	 * updateNguyenVong
	 *
	 * @param nguyenVong
	 * @return
	 */
	@Override
	public NguyenVong updateNguyenVong(NguyenVong nguyenVong) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(nguyenVong);
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
		
		return nguyenVong;
	}

	/**
	 * destroyNguyenVong
	 *
	 * @param NguyenVong
	 * @return
	 */
	@Override
	public boolean destroyNguyenVong(NguyenVong nguyenVong) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.delete(nguyenVong);
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
	 * getListNguyenVong
	 *
	 * @return
	 */
	@Override
	public List<NguyenVongResponse> getListNguyenVong() {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<NguyenVongResponse> query = builder.createQuery(NguyenVongResponse.class);
		Root<NguyenVongResponse> root = query.from(NguyenVongResponse.class);
//		Predicate p = builder.equal(root.get("idHoSoXetTuyen"), hoSoXetTuyenService.getHoSo().getId());
//		query.select(root).where(p);
		query.select(root);
		List<NguyenVongResponse> nguyenVonglist = session.createQuery(query).getResultList();
		return nguyenVonglist;
	}
}
