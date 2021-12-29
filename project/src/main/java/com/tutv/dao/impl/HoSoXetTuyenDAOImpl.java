/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.transaction.annotation.Transactional;

import com.tutv.dao.HoSoXetTuyenDAO;
import com.tutv.entity.HoSoXetTuyen;
import com.tutv.response.BTSHoSoXetTuyenResponse;
import com.tutv.response.ChilTruongThpt;
import com.tutv.response.HoSoXetTuyenResponse;

/**
 * HoSoXetTuyenDAO
 */
@Transactional
public class HoSoXetTuyenDAOImpl implements HoSoXetTuyenDAO {
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
	public HoSoXetTuyen updateHoSo(HoSoXetTuyen hoSoXetTuyen) {
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
			return hoSoXetTuyen;
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
	}

	/**
	 * getListHoSo
	 *
	 * @return
	 */
	@Override
	public List<BTSHoSoXetTuyenResponse> getListHoSo() {
		// Session session = this.sessionFactory.getCurrentSession();
		// CriteriaBuilder builder = session.getCriteriaBuilder();
		// CriteriaQuery<BTSHoSoXetTuyenResponse> query =
		// builder.createQuery(BTSHoSoXetTuyenResponse.class);
		// Root<BTSHoSoXetTuyenResponse> root =
		// query.from(BTSHoSoXetTuyenResponse.class);
		// //Predicate p = builder.equal(root.get("id"), id);
		// query.select(root);
		// List<BTSHoSoXetTuyenResponse> khoalist =
		// session.createQuery(query).getResultList();
		// return khoalist;
//		Session session = this.sessionFactory.getCurrentSession();
//		List<BTSHoSoXetTuyenResponse> historys = new ArrayList<BTSHoSoXetTuyenResponse>();
//		historys = session.createNativeQuery(
//		    "SELECT `ho_so_xet_tuyen`.*,nguyen_vong.diemtb_mon_mot,nguyen_vong.diemtb_mon_hai,nguyen_vong.diemtb_mon_ba,nguyen_vong.`id_to_hop_mon`,to_hop_mon.`ma_to_hop_mon`,to_hop_mon.`id_nganh`,nganh.`ten_nganh`,nguyen_vong.`diem_xet_tuyen`FROM ho_so_xet_tuyen LEFT JOIN nguyen_vong ON ho_so_xet_tuyen.id = nguyen_vong.`id_ho_so_xet_tuyen` LEFT JOIN to_hop_mon ON to_hop_mon.id = nguyen_vong.`id_to_hop_mon` LEFT JOIN nganh ON nganh.id = to_hop_mon.`id_nganh` ",
//		    BTSHoSoXetTuyenResponse.class).getResultList();
//		for (BTSHoSoXetTuyenResponse history : historys) {
//			ChilTruongThpt childrenResponse = session
//			    .createNativeQuery("SELECT `truong_thpt`.`id` ,`truong_thpt`.`ten_truong`   " + "FROM `truong_thpt` "
//			        + " WHERE `truong_thpt`.`id` = '" + history.getIdTruongThpt10() + "'", ChilTruongThpt.class)
//			    .getSingleResult();
//			history.setIdTruongThpt10Obj(childrenResponse);
//
//			ChilTruongThpt childrenResponse1 = session
//			    .createNativeQuery("SELECT `truong_thpt`.`id` ,`truong_thpt`.`ten_truong`   " + "FROM `truong_thpt` "
//			        + " WHERE `truong_thpt`.`id` = '" + history.getIdTruongThpt11() + "'", ChilTruongThpt.class)
//			    .getSingleResult();
//			history.setIdTruongThpt11Obj(childrenResponse1);
//
//			ChilTruongThpt childrenResponse2 = session
//			    .createNativeQuery("SELECT `truong_thpt`.`id` ,`truong_thpt`.`ten_truong`   " + "FROM `truong_thpt` "
//			        + " WHERE `truong_thpt`.`id` = '" + history.getIdTruongThpt12() + "'", ChilTruongThpt.class)
//			    .getSingleResult();
//			history.setIdTruongThpt12Obj(childrenResponse2);
//
//		}
//		return historys;
		Session session = this.sessionFactory.getCurrentSession();
		List<BTSHoSoXetTuyenResponse> historys = new ArrayList<BTSHoSoXetTuyenResponse>();
		historys = session.createNativeQuery(
		    "SELECT `ho_so_xet_tuyen`.*,nguyen_vong.diemtb_mon_mot,nguyen_vong.id as id_nguyen_vong ,nguyen_vong.diemtb_mon_hai,nguyen_vong.diemtb_mon_ba,nguyen_vong.`id_to_hop_mon`,to_hop_mon.`ma_to_hop_mon`,to_hop_mon.`id_nganh`,nganh.`ten_nganh`,nguyen_vong.`diem_xet_tuyen`FROM ho_so_xet_tuyen LEFT JOIN nguyen_vong ON ho_so_xet_tuyen.id = nguyen_vong.`id_ho_so_xet_tuyen` LEFT JOIN to_hop_mon ON to_hop_mon.id = nguyen_vong.`id_to_hop_mon` LEFT JOIN nganh ON nganh.id = to_hop_mon.`id_nganh` ",
		    BTSHoSoXetTuyenResponse.class).getResultList();
		for (BTSHoSoXetTuyenResponse history : historys) {
			ChilTruongThpt childrenResponse = session
			    .createNativeQuery("SELECT `truong_thpt`.`id` ,`truong_thpt`.`ten_truong`   " + "FROM `truong_thpt` "
			        + " WHERE `truong_thpt`.`id` = '" + history.getIdTruongThpt10() + "'", ChilTruongThpt.class)
			    .getSingleResult();
			history.setIdTruongThpt10Obj(childrenResponse);

			ChilTruongThpt childrenResponse1 = session
			    .createNativeQuery("SELECT `truong_thpt`.`id` ,`truong_thpt`.`ten_truong`   " + "FROM `truong_thpt` "
			        + " WHERE `truong_thpt`.`id` = '" + history.getIdTruongThpt11() + "'", ChilTruongThpt.class)
			    .getSingleResult();
			history.setIdTruongThpt11Obj(childrenResponse1);

			ChilTruongThpt childrenResponse2 = session
			    .createNativeQuery("SELECT `truong_thpt`.`id` ,`truong_thpt`.`ten_truong`   " + "FROM `truong_thpt` "
			        + " WHERE `truong_thpt`.`id` = '" + history.getIdTruongThpt12() + "'", ChilTruongThpt.class)
			    .getSingleResult();
			history.setIdTruongThpt12Obj(childrenResponse2);

		}
		return historys;
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

	/**
	 * getHoSoXetTuyenById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public HoSoXetTuyen getHoSoXetTuyenById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<HoSoXetTuyen> query = builder.createQuery(HoSoXetTuyen.class);
		Root<HoSoXetTuyen> root = query.from(HoSoXetTuyen.class);
		Predicate p = builder.equal(root.get("id"), id);
		query.select(root).where(p);
		HoSoXetTuyen hoSoXetTuyen = session.createQuery(query).setMaxResults(1).uniqueResult();
		return hoSoXetTuyen;
	}
}
