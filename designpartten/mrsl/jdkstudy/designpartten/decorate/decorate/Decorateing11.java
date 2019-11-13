package mrsl.jdkstudy.designpartten.decorate.decorate;

import mrsl.jdkstudy.designpartten.decorate.def.Component;
import mrsl.jdkstudy.designpartten.decorate.def.Decorate2;

/**
 * ��decorate1һ����ֻ�������ù��캯������ʽ���а�װ
 * ͬ��װ��decoratedclass�е�method1����
 * @author Administrator
 *
 */
public class Decorateing11 extends Decorate2{

	public Decorateing11(Component comp) {
		super(comp);
	}
	
	@Override
	public void method1() {
		super.method1();
		methodsub3();
		methodsub2();
		methodsub1();
	}
	
	private void methodsub3() {
		// TODO Auto-generated method stub
		System.out.println("methodsub3 do something");
	}

	private void methodsub2() {
		// TODO Auto-generated method stub
		System.out.println("methodsub2 do something");

	}

	private void methodsub1() {
		// TODO Auto-generated method stub
		System.out.println("methodsub1 do something");

	}
	
}
