package com.sunli.jdkstudy.decorateandextend;

public abstract class DecorateingFilter implements BuildTestInterface{
	protected BuildTestInterface in;
	
	private int a;
	
	private int b;
	
	
	public DecorateingFilter(BuildTestInterface in) {
	
	}
	
	public void test2() {
		in.test2();
	}
	
	public void test1() {
		in.test1();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public abstract void test3();
	public abstract void test4();
	
}
