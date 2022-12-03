package com.prajwal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prajwal.entity.Department;
import com.prajwal.dao.DepartmentDao;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public void add(Department department) {
		departmentDao.save(department);
	}

	@Override
	public void modify(Department department) {
		departmentDao.save(department);
	}

	@Override
	public void remove(int no) {
		departmentDao.deleteById(no);
	}

	@Override
	public Department get(int no) {
		Optional<Department> opt = departmentDao.findById(no);
		Department department = opt.get();
		return department;
	}

	@Override
	public List<Department> getAll() {
		Iterable<Department> itr = departmentDao.findAll();
		List<Department> lst = new ArrayList<Department>();
		itr.forEach(ele -> lst.add(ele));
		return lst;
	}

}
