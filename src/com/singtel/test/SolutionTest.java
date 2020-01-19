package com.singtel.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
	
	public  final static String FLY="I am flying";
	
	public  final static String SING="Bird is singing";
	
	public  final static String WALK="I am walking";
	
	Solution sol = new Solution();

	@Test
	void testsingcount() {
		assertEquals(3, sol.singcount());
	}
	@Test
	void testflycount() {
		assertEquals(7, sol.flycount());
	}
	@Test
	void testwalkcount() {
		assertEquals(7, sol.walkcount());
	}
	@Test
	void testswimcount() {
		assertEquals(11, sol.swimcount());
	}
}
