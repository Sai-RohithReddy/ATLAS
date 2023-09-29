package com.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingServiceTest {
	AddingService add;
	@Test
	public void testSum1() {
		add = new AddingService();
		int result = add.sum(5, 5);
		assertEquals(10, result);
	}

	@Test
	public void testSum2() {
		add = new AddingService();
		int result = add.sum(5, 5);
		assertNotEquals(9, result);
	}

}
