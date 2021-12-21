/**
 * @package com.tutv.service
 * @date Dec 17, 2021
 * @author trinh
 */
package com.tutv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tutv.dao.TaiKhoanDAO;
import com.tutv.entity.TaiKhoan;
import com.tutv.response.TaiKhoanResponse;

/**
 * UserDetailsService
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	TaiKhoanDAO taiKhoanDAO;
	@Autowired
	private TaiKhoanService khoanService;
	/**
	 * loadUserByUsername
	 *
	 * @param username
	 * @return
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		TaiKhoan taiKhoan = null;
    taiKhoan = this.khoanService.getTaiKhoanByEmail(email);
    TaiKhoan user = new TaiKhoan();
    user.setEmail(taiKhoan.getEmail());
    user.setPassword(taiKhoan.getPassword());
    user.setEnabled(taiKhoan.getEnabled());
    user.setRole(taiKhoan.getRole());
//		try {
//			taiKhoan = this.khoanService.getTaiKhoanByEmail(email);
//		} catch (Exception e) {
//			if (email.equals("tvtu165@gmail.com")) {
//				taiKhoan = new TaiKhoan();
//				taiKhoan.setEmail(email);
//				taiKhoan.setRole("ADMIN");
//				taiKhoan.setPassword("123456");
//				taiKhoan.setEnabled(true);
//			}
//			else if (email.equals("trinhtu16051999@gmail.com")) {
//				taiKhoan = new TaiKhoan();
//				taiKhoan.setEmail(email);
//				taiKhoan.setRole("USER");
//				taiKhoan.setPassword("123456");
//				taiKhoan.setEnabled(true);
//			}
//		}

		if (user == null) {
			throw new UsernameNotFoundException("Email " + email + " was not found in the database");
		}

		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		if (taiKhoan.getRole() != null) {
			GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + taiKhoan.getRole());
			grantList.add(authority);
		}

		UserDetails userDetails = (UserDetails) new User(taiKhoan.getEmail(),
				taiKhoan.getPassword(), grantList);
		return userDetails;
	}

}
