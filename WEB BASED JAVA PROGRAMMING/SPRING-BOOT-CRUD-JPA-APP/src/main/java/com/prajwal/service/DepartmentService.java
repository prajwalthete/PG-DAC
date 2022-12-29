package com.prajwal.service;

import java.util.List;

import com.prajwal.entity.Department;

public interface DepartmentService {
	void add(Department department);

	void modify(Department department);

	void remove(int no);

	Department get(int no);

	List<Department> getAll();
}
