package com.edu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLogin {
	
	Login l;
	
	@Before
	public void invoke() {
		l = new Login();
	}
	
	@Test
	public  void testLoginWithValidEmailValidPassword() {
		assertTrue(l.login("rohithreddy8919@gmail.com", "abc123"));
	}
	
	@Test
	public  void testLoginWithInvalidEmailValidPassword() {
		assertFalse(l.login("rohithreddy891@gmail.com", "abc123"));
	}
	
	@Test
	public  void testLoginWithValidEmailInvalidPassword() {
		assertFalse(l.login("rohithreddy8919@gmail.com", "abc1123"));
	}
	
	@Test
	public  void testLoginWithInvalidEmailInvalidPassword() {
		assertFalse(l.login("rohithreddy891@gmail.com", "abc1123"));
	}

}
