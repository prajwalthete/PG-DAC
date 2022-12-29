package com.prajwal.dao;

import java.util.List;

import com.prajwal.entity.Product;

public interface ProductDao {
	void save(Product product);

	List<Product> selectAll();

	void delete(int no);

	Product select(int no);

	void update(Product product);

	void upload(int no, String image);
}
