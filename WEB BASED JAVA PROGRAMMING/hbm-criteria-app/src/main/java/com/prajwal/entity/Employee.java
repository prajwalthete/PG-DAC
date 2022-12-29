package com.prajwal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "salary")
	private float salary;
	@Column(name = "dept")
	private String dept;
	@Column(name = "hdate")
	@Temporal(TemporalType.DATE)
	private Date hdate;

	public Employee() {

	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(int id, String name, float salary, String dept, Date hdate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.hdate = hdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getHdate() {
		return hdate;
	}

	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary + " " + dept + " " + hdate;
	}

}
