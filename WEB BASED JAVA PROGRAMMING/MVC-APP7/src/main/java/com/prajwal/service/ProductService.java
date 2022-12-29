package com.prajwal.service;

import java.util.List;

import com.prajwal.entity.Product;

public interface ProductService {
	void add(Product product);

	List<Product> getAll();

	void remove(int no);

	Product get(int no);

	void modify(Product product);

	void upload(int no, String image);
}
