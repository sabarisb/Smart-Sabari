package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.LoginDAO;
import com.demo.entity.User;

@Service
public class LoginServiceImpl implements LoginService {
	// need to inject login dao
	@Autowired
	private LoginDAO loginDAO;

	@Override
	@Transactional
	public void saveUser(User user) {
		user.setPassword(encode(user.getPassword()));
		loginDAO.saveUser(user);
	}

	@Override
	@Transactional
	public User validateUser(User user) {
		User validatedUser = loginDAO.validateUser(user);
		if (match(user.getPassword().trim(), validatedUser.getPassword().trim())) {
			return validatedUser;
		} else
			return null;
	}

	public static String encode(String password) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(password);
		return encodedPassword;
	}

	public static boolean match(String rawPassword, String encodedPassword) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.matches(rawPassword, encodedPassword);
	}
}
