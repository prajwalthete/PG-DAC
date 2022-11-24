package com.prajwal.dao;

import java.util.List;

import com.prajwal.entity.Product;

public interface ProductDao {
	void save(Product product);
	List<Product> selectAll();
}
