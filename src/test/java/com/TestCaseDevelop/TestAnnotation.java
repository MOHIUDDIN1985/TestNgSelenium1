package com.TestCaseDevelop;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {
	@BeforeTest
	public void BT() {
		System.out.println("This is Before Test");
	}
	@Test
	public void Test1() {
		System.out.println("This is test");
	}
	@Test
	public void Tstc2() {
		System.out.println("This is test2");
	}
	@AfterTest
	public void AT() {
		System.out.println("This is aftet test");
	}

}
