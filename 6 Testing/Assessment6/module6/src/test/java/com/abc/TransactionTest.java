package com.abc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionTest {
	
	@Test
	public void testDepositValid() {
		Transaction t = new Transaction();
		t.deposit(100);
		assertEquals(200, t.getBalance());
	}

	@Test
	public void testWithdraValid() {
		Transaction t = new Transaction();
		t.withdra(50);
		assertEquals(50, t.getBalance());
	}

	@Test
	public void testGetBalanceValid() {
		Transaction t = new Transaction();
		assertEquals(100, t.getBalance());
	}
	
	@Test
	public void testDepositInValid() {
		Transaction t = new Transaction();
		t.deposit(100);
		assertNotEquals(100, t.getBalance());
	}

	@Test
	public void testWithdraInValid() {
		Transaction t = new Transaction();
		t.withdra(50);
		assertNotEquals(100, t.getBalance());
	}

	@Test
	public void testGetBalanceInValid() {
		Transaction t = new Transaction();
		assertNotEquals(200, t.getBalance());
	}

}
