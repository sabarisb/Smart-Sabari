package com.demo.dao;

import com.demo.entity.User;

public interface LoginDAO {
	public void saveUser(User user);

	public User validateUser(User user);
}
