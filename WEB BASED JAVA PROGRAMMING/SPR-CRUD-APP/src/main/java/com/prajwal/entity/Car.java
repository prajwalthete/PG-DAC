package com.prajwal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String model;
	private String make;
	private float price;
	private String mdate;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id) {
		super();
		this.id = id;
	}

	public Car(String model, String make, float price, String mdate) {
		super();
		this.model = model;
		this.make = make;
		this.price = price;
		this.mdate = mdate;
	}

	public Car(int id, String model, String make, float price, String mdate) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.price = price;
		this.mdate = mdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	@Override
	public String toString() {
		return id + " " + model + " " + make + " " + price + " " + mdate;
	}

}
