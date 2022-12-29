package com.prajwal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prajwal.entity.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
