package com.prajwal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prajwal.conn.MyConnection;
import com.prajwal.entity.User;

public class UserDaoImpl implements UserDao {

	private MyConnection myConn;

	public UserDaoImpl() {
		myConn = new MyConnection();
	}

	@Override
	public boolean login(User user) {
		boolean flag = false;
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from user where uname =? and upass =?");
			s.setString(1, user.getUname());
			s.setString(2, user.getUpass());
			ResultSet rs = s.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
