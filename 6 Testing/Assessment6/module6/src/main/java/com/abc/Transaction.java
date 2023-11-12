package com.abc;

public class Transaction {
	int amount = 100;
	public int deposit(int a) {
		amount += a;
		return amount;
	}
	public int withdra(int a) {
		amount -= a;
		return amount;
	}
	public int getBalance() {
		return amount;
	}
}
