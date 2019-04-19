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
		Decorate dq1 = new Decorate();
		DecrateExtend dq = new DecrateExtend();
		dq1.test1();
		dq.test3();
		dq.test1();
	}
	
}
