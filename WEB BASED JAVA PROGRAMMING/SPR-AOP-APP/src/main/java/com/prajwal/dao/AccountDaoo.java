package com.prajwal.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoo {
	public void create() {
		System.out.println("creating account");
	}

	public void deposite() {
		System.out.println("deposite");
	}

	public void withdraw() {
		System.out.println("withdraw");
	}

	public void accDetail() {
		System.out.println("account info");
	}

	public void block() {
		System.out.println("block account");
	}
}
