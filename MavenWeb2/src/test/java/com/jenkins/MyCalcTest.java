package com.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {

	@Test
	public void test1() {
		assertEquals(100,new MyCalc().getSum(50,50) );
	}
	@Test
	public void test2() {
		assertEquals(10,new MyCalc().getSum(2,8) );
	}
	@Test
	public void test3() {
		assertEquals(15,new MyCalc().getDiff(25,10) );
	}
	@Test
	public void test4() {
		assertEquals(0,new MyCalc().getDiff(5,5) );
	}
}
