package com.sunli.jdkstudy.decorateandextend;

public class DecrateExtend extends Decorate{

	@Override
	public void  test2() {
		System.out.println("�ⶫ���ɹ��ˣ�����");
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
