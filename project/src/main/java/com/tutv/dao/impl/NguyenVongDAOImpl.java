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
import com.tutv.response.ChilNganh;
import com.tutv.response.ChilToHopMon;
import com.tutv.response.CommonResponse;
import com.tutv.response.NguyenVongResponse;
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
	public List<NguyenVongResponse> getListNguyenVong(Integer idHoSo) {
		
//		Session session = this.sessionFactory.getCurrentSession();
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		CriteriaQuery<NguyenVongResponse> query = builder.createQuery(NguyenVongResponse.class);
//		Root<NguyenVongResponse> root = query.from(NguyenVongResponse.class);
//		Predicate p = builder.equal(root.get("idHoSoXetTuyen"),idHoSo );
//		query.select(root).where(p);
//		query.select(root);
//		List<NguyenVongResponse> nguyenVonglist;
//		try {
//			nguyenVonglist = session.createQuery(query).getResultList();
//		} catch (Exception e) {
//			@SuppressWarnings("unchecked")
//			List<NguyenVongResponse> nguyenVonglist1  = (List<NguyenVongResponse>) session.createQuery(query).getSingleResult();
//			return nguyenVonglist1;
//		}
//		return nguyenVonglist;
		
		Session session = this.sessionFactory.getCurrentSession();
		List<NguyenVongResponse> historys = session.createNativeQuery("SELECT `nguyen_vong`.* " + "FROM `nguyen_vong`  WHERE `nguyen_vong`.`id_ho_so_xet_tuyen` = '" + idHoSo + "'", NguyenVongResponse.class).getResultList();
		for (NguyenVongResponse history : historys) {
			CommonResponse childrenResponse = session.createNativeQuery(
			    "SELECT `to_hop_mon`.`id` ,`to_hop_mon`.`ma_to_hop_mon`  \r\n" + "FROM `to_hop_mon`\r\n"
			        + " WHERE `to_hop_mon`.`id` = '" + history.getIdToHopMon() + "' ORDER BY `to_hop_mon`.`id` ASC",
			        CommonResponse.class).getSingleResult();
			history.setIdToHopMonObj(childrenResponse);
			
			ChilToHopMon childrenResponse2 = session.createNativeQuery(
			    "SELECT `nganh`.`id` ,`nganh`.`ten_nganh`  \r\n" + "FROM `nganh`, `to_hop_mon`"
			        + " WHERE `to_hop_mon`.`id_nganh` = `nganh`.`id` AND `to_hop_mon`.`id` = '" + childrenResponse.getId() + "'",
			        ChilToHopMon.class).getSingleResult();
			history.setIdNganhObj(childrenResponse2);
		}
		
		return historys;
	}
}
