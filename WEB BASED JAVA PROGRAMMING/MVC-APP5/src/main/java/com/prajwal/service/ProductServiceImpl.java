package com.prajwal.service;

import java.util.List;

import com.prajwal.dao.ProductDao;
import com.prajwal.dao.ProductDaoImpl;
import com.prajwal.entity.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public ProductServiceImpl() {
		productDao = new ProductDaoImpl();
	}

	@Override
	public void add(Product product) {
		productDao.save(product);
	}

	@Override
	public List<Product> getAll() {
		return productDao.selectAll();
	}

	@Override
	public void remove(int no) {
		productDao.delete(no);
	}

	@Override
	public Product get(int no) {
		return productDao.select(no);
	}

	@Override
	public void modify(Product product) {
		productDao.update(product);
	}

}
