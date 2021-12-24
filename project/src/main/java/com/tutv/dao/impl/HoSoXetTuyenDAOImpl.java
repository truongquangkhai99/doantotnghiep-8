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

import com.tutv.dao.HoSoXetTuyenDAO;
import com.tutv.entity.HoSoXetTuyen;
import com.tutv.response.HoSoXetTuyenResponse;
import com.tutv.response.KhoaResponse;
/**
 * HoSoXetTuyenDAO
 */
@Transactional
public class HoSoXetTuyenDAOImpl implements HoSoXetTuyenDAO{
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
	 * saveHoSo
	 *
	 * @param hoSoXetTuyen
	 * @return
	 */
	@Override
	public HoSoXetTuyen saveHoSo(HoSoXetTuyen hoSoXetTuyen) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Serializable id = session.save(hoSoXetTuyen);
			tx.commit();
			if (session != null) {
				session.close();
			}
			hoSoXetTuyen = findHoSoXetTuyenById((Integer) id);
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
		
		return hoSoXetTuyen;
	}

	/**
	 * findHoSoXetTuyenById
	 *
	 * @param id
	 * @return
	 */
	public HoSoXetTuyen findHoSoXetTuyenById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<HoSoXetTuyen> query = builder.createQuery(HoSoXetTuyen.class);
		Root<HoSoXetTuyen> root = query.from(HoSoXetTuyen.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		HoSoXetTuyen hoSoXetTuyen = session.createQuery(query).setMaxResults(1).uniqueResult();
		return hoSoXetTuyen;
	}
	
	@Override
	public void updateHoSo(HoSoXetTuyen hoSoXetTuyen) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(hoSoXetTuyen);
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
			
		}
	}

	/**
	 * getListHoSo
	 *
	 * @return
	 */
	@Override
	public List<HoSoXetTuyenResponse> getListHoSo() {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<HoSoXetTuyenResponse> query = builder.createQuery(HoSoXetTuyenResponse.class);
		Root<HoSoXetTuyenResponse> root = query.from(HoSoXetTuyenResponse.class);
		//Predicate p = builder.equal(root.get("id"), id);
		query.select(root);
		List<HoSoXetTuyenResponse> khoalist = session.createQuery(query).getResultList();
		return khoalist;
	}

	/**
	 * getHoSo
	 *
	 * @return
	 */
	@Override
	public HoSoXetTuyenResponse getHoSo(Integer idTaiKhoan) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<HoSoXetTuyenResponse> query = builder.createQuery(HoSoXetTuyenResponse.class);
		Root<HoSoXetTuyenResponse> root = query.from(HoSoXetTuyenResponse.class);
		Predicate p = builder.equal(root.get("idTaiKhoan"), idTaiKhoan);
		query.select(root).where(p);
		HoSoXetTuyenResponse hoSoXetTuyen = session.createQuery(query).setMaxResults(1).uniqueResult();
		return hoSoXetTuyen;
	}
}
