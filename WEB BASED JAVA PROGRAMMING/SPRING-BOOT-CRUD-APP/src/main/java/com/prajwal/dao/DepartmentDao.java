package com.prajwal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prajwal.entity.Department;

@Repository
public interface DepartmentDao extends CrudRepository<Department, Integer> {

}
