package com.sunli.jdkstudy.decorateandextend;

public class DecorateingFilter implements BuildTestInterface{
	protected BuildTestInterface in;
	
	public DecorateingFilter(BuildTestInterface in) {
		this.in=in;
	}
	
	public void test2() {
		in.test2();
	}
	
	public void test1() {
		in.test1();
	}
}
