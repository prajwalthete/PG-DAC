package com.prajwal.service;

import java.util.List;

import com.prajwal.entity.Product;

public interface ProductService {
	void add(Product product);

	List<Product> getAll();
}
