package com.demo.service;

import com.demo.entity.User;

public interface LoginService {

	public void saveUser(User user);

	public User validateUser(User user);
}
