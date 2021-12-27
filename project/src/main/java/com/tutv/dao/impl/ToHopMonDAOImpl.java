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

import com.tutv.dao.ToHopMonDAO;
import com.tutv.entity.ToHopMon;
import com.tutv.response.ChilToHopMon;
import com.tutv.response.ToHopMonResponse;

/**
 * ToHopMonDAO
 */
@Transactional
public class ToHopMonDAOImpl implements ToHopMonDAO{
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
	 * findToHopMonById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public ToHopMon findToHopMonById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<ToHopMon> query = builder.createQuery(ToHopMon.class);
		Root<ToHopMon> root = query.from(ToHopMon.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		ToHopMon khoa = session.createQuery(query).setMaxResults(1).uniqueResult();
		return khoa;
	}

	/**
	 * getToHopMonById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public ToHopMonResponse getToHopMonById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<ToHopMonResponse> query = builder.createQuery(ToHopMonResponse.class);
		Root<ToHopMonResponse> root = query.from(ToHopMonResponse.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		ToHopMonResponse khoa = session.createQuery(query).setMaxResults(1).uniqueResult();
		return khoa;
	}

	/**
	 * createToHopMon
	 *
	 * @param khoa
	 * @return
	 */
	@Override
	public ToHopMon createToHopMon(ToHopMon khoa) {
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
			khoa = findToHopMonById((Integer) id);
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
	 * updateToHopMon
	 *
	 * @param khoa
	 * @return
	 */
	@Override
	public ToHopMon updateToHopMon(ToHopMon khoa) {
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
	 * destroyToHopMon
	 *
	 * @param ToHopMon
	 * @return
	 */
	@Override
	public boolean destroyToHopMon(ToHopMon khoa) {
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
	 * getListToHopMon
	 *
	 * @return
	 */
	@Override
	public List<ToHopMonResponse> getListToHopMon() {
//		Session session = this.sessionFactory.getCurrentSession();
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		CriteriaQuery<ToHopMonResponse> query = builder.createQuery(ToHopMonResponse.class);
//		Root<ToHopMonResponse> root = query.from(ToHopMonResponse.class);
//		//Predicate p = builder.equal(root.get("id"), id);
//		query.select(root);
//		List<ToHopMonResponse> khoalist = session.createQuery(query).getResultList();
//		return khoalist;
		
		Session session = this.sessionFactory.getCurrentSession();
		List<ToHopMonResponse> historys = session.createNativeQuery("SELECT `to_hop_mon`.* \r\n" + "FROM `to_hop_mon`\r\n", ToHopMonResponse.class).getResultList();
		for (ToHopMonResponse history : historys) {
			ChilToHopMon childrenResponse = session.createNativeQuery(
			    "SELECT `nganh`.`id` ,`nganh`.`ten_nganh`  \r\n" + "FROM `nganh`\r\n"
			        + " WHERE `nganh`.`id` = '" + history.getIdNganh() + "' ORDER BY `nganh`.`id` ASC",
			        ChilToHopMon.class).getSingleResult();
			history.setIdNganhObj(childrenResponse);
		}
		return historys;
	}
	/**
	 * getListToHopMonByNganh
	 *
	 * @param idNganh
	 * @return
	 */
	@Override
	public List<ToHopMonResponse> getListToHopMonByNganh(Integer idNganh) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<ToHopMonResponse> query = builder.createQuery(ToHopMonResponse.class);
		Root<ToHopMonResponse> root = query.from(ToHopMonResponse.class);
		Predicate p = builder.equal(root.get("idNganh"), idNganh);
		query.select(root).where(p);
		List<ToHopMonResponse> khoalist = session.createQuery(query).getResultList();
		return khoalist;
	}
}

