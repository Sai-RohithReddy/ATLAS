package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test(timeout = 100)
	public void testArraySort1() {
		int[] actual = {4,3,2,1};
		int[] expected = {1,2,3,4};
		Arrays.sort(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testArraySort2() {
		int[] actual = {4,3,2,1};
		int[] expected = {1,2,3,4};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArrayException1() {
		int[] arr = null;
		Arrays.sort(arr);
	}

	@Test(expected = NullPointerException.class)
	public void testArrayException2() {
		int[] arr = {};
		Arrays.sort(arr);
	}
}
