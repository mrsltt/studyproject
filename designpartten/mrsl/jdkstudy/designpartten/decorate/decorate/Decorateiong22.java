package mrsl.jdkstudy.designpartten.decorate.decorate;

import mrsl.jdkstudy.designpartten.decorate.def.Component;
import mrsl.jdkstudy.designpartten.decorate.def.Decorate2;

public class Decorateiong22 extends Decorate2{

	public Decorateiong22(Component comp) {
		super(comp);
	}
	@Override
	public void method1() {
		super.method1();
		methodsub4();
		methodsub5();
		methodsub6();
		
	}

	private void methodsub4() {
		// TODO Auto-generated method stub
		System.out.println("methodsub4 do something");
	}

	private void methodsub5() {
		// TODO Auto-generated method stub
		System.out.println("methodsub5 do something");

	}

	private void methodsub6() {
		// TODO Auto-generated method stub
		System.out.println("methodsub6 do something");

	}
	
	
}
