package com.sunli.jdkstudy.decorateandextend;

public class Decorateing extends DecorateingFilter{

	public Decorateing(BuildTestInterface in) {
		super(in);
	}
	@Override
	public void  test2() {
		System.out.println("这东西成功了！！！");
	}
	public void test3() {
		super.test2();
	}
	@Override
	public void test1() {
		test2();
	}
	public static void main(String args[]) {
		Decorate d = new Decorate();
		Decorateing dq = new Decorateing(d);
		dq.test1();
		dq.test3();
	}
	
	
}
