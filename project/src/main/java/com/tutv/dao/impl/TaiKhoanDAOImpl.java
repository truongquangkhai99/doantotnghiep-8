/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.tutv.dao.TaiKhoanDAO;
import com.tutv.dto.LoginDto;
import com.tutv.entity.TaiKhoan;
import com.tutv.response.TaiKhoanResponse;

/**
 * TaiKhoanDAO
 */
@Transactional
public class TaiKhoanDAOImpl implements TaiKhoanDAO {
	
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
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * getTaiKhoanLogin
	 *
	 * @param loginDto
	 * @return TaiKhoan
	 */
	public TaiKhoan getTaiKhoanLogin(LoginDto loginDto) {
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<TaiKhoan> query = builder.createQuery(TaiKhoan.class);
		Root<TaiKhoan> root = query.from(TaiKhoan.class);
		Predicate p1 = builder.equal(root.get("email"), loginDto.getEmail());
		Predicate p2 = builder.equal(root.get("password"), loginDto.getPassword());
		query.select(root).where(builder.and(p1, p2));
		return session.createQuery(query).getSingleResult();
	}

	/**
	 * findTaiKhoanByEmail
	 *
	 * @param email
	 * @return TaiKhoan
	 */
	public TaiKhoanResponse findTaiKhoanByEmail(String email) {
		TaiKhoanResponse khoanResponse = null;
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<TaiKhoanResponse> query = builder.createQuery(TaiKhoanResponse.class);
		Root<TaiKhoanResponse> root = query.from(TaiKhoanResponse.class);
		query.select(root).where(builder.equal(root.get("email"), email));
		try {
			khoanResponse = session.createQuery(query).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return khoanResponse;
	}

	public TaiKhoan getTaiKhoanByEmail(String email) {
		TaiKhoan khoanResponse = null;
		Session session = this.sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<TaiKhoan> query = builder.createQuery(TaiKhoan.class);
		Root<TaiKhoan> root = query.from(TaiKhoan.class);
		query.select(root).where(builder.equal(root.get("email"), email));
		try {
			khoanResponse = session.createQuery(query).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return khoanResponse;
	}
	/**
	 * createTaiKhoanAccount
	 * 
	 * @param user
	 */
	public boolean createTaiKhoanAccount(TaiKhoan user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			return false;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	/**
	 * updateTaiKhoan
	 *
	 * @param user
	 * @param ref
	 * @return
	 */
	@Override
	public Boolean updateTaiKhoan(String email) {
		TaiKhoan user = null;
		user = getTaiKhoanByEmail(email);
		user.setEnabled(true);
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(user);
			tx.commit();
			if (session != null) {
				session.close();
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			if (session != null) {
				session.close();
			}
			return false;
		}
		
	}

	/**
	 * destroyTaiKhoan
	 *
	 * @param user
	 * @return
	 */
	public boolean destroyTaiKhoan(TaiKhoan user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.delete(user);
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
	 * findTaiKhoanById
	 *
	 * @param id
	 * @return
	 */
	@Override
	public TaiKhoan findTaiKhoanById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		TaiKhoan user = (TaiKhoan) session.get(TaiKhoan.class, id);
		return user;
	}

	/**
	 * taikhoanList
	 *
	 * @param lang
	 * @return
	 */
	@Override
	public List<TaiKhoanResponse> taikhoanList() {
		// TODO Auto-generated method stub
		return null;
	}

}
