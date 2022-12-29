package com.prajwal.service;

import com.prajwal.dao.UserDao;
import com.prajwal.dao.UserDaoImpl;
import com.prajwal.entity.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public boolean login(User user) {
		return userDao.login(user);
	}

}
