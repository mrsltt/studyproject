package com.sunli.jdkstudy.decorateandextend;

public class Decorate implements BuildTestInterface{

	public void test1() {
		System.out.println("decorater1");
		test2();
	}
	
	public void test2() {
		System.out.println("decorater2");
	}
}
