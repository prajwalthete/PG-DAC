package com.prajwal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.prajwal.conn.MyConnection;
import com.prajwal.entity.Product;

public class ProductDaoImpl implements ProductDao {

	private MyConnection myConn;

	public ProductDaoImpl() {
		myConn = new MyConnection();
	}

	@Override
	public void save(Product product) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con
					.prepareStatement("insert into product(name,price,category,mdate) values(?,?,?,?)");
			s.setString(1, product.getName());
			s.setFloat(2, product.getPrice());
			s.setString(3, product.getCategory());
			s.setString(4, product.getMdate());
			int i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> selectAll() {
		List<Product> lst = new ArrayList<Product>();
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from product");
			ResultSet rs = s.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setNo(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getFloat(3));
				product.setCategory(rs.getString(4));
				product.setMdate(rs.getString(5));
				lst.add(product);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public void delete(int no) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("delete from product where no = ?");
			s.setInt(1, no);
			int i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Product select(int no) {
		Product product = new Product();
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from product where no = ?");
			s.setInt(1, no);
			ResultSet rs = s.executeQuery();
			if (rs.next()) {
				product.setNo(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getFloat(3));
				product.setCategory(rs.getString(4));
				product.setMdate(rs.getString(5));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public void update(Product product) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con
					.prepareStatement("update product set name =?,price = ?,category = ?,mdate = ? where no = ?");
			s.setString(1, product.getName());
			s.setFloat(2, product.getPrice());
			s.setString(3, product.getCategory());
			s.setString(4, product.getMdate());
			s.setInt(5, product.getNo());
			int i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
