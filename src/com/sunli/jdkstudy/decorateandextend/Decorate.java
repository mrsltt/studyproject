package com.sunli.jdkstudy.decorateandextend;

public class Decorate implements BuildTestInterface{

	public void test1() {
		System.out.println("decorater1tst1");
		test2();
	}
	
	public void test2() {
		System.out.println("decorater2test2");
	}
}
