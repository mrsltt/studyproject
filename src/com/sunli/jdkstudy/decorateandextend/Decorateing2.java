package com.sunli.jdkstudy.decorateandextend;

public class Decorateing2 extends DecorateingFilter{

	public Decorateing2(DecorateingFilter in) {
		super(in,in.getA(),in.getB());
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}
	
}
