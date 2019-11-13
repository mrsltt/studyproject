package mrsl.jdkstudy.designpartten.decorate.decorate;

import mrsl.jdkstudy.designpartten.decorate.def.Decorate;

/**
 * 装饰2类，注意该类必须继承Decorate，并且装饰所有Decorate中
 * 所声明的待装饰方法，其在遵循里氏原则的基础上可以自行动态扩展
 * 以装饰待装饰类
 * 为method1 增加methodsub4，methodsub5，methodsub6
 * @author Administrator
 *
 */
public class Decorateing2 extends Decorate{
	public void method1() {
		methodsub4();
		methodsub5();
		super.method1();
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
