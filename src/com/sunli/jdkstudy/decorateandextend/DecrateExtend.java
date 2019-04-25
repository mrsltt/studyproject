package com.sunli.jdkstudy.decorateandextend;

public class DecrateExtend extends Decorate{

	@Override
	public void  test2() {
		System.out.println("这东西成功了！！！");
	}

	public void test3() {
		super.test1();
	}
	
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		Decorate dq1 = new Decorate();
		Decorateing d1 = new Decorateing(dq1, a, b);
		Decorateing2 d2  = new Decorateing2(d1);
		
	}
	
}
