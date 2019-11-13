package mrsl.jdkstudy.designpartten.decorate.decorate;

import mrsl.jdkstudy.designpartten.decorate.def.Decorate;

/**
 * 装饰1类，注意该类必须继承Decorate，并且装饰所有Decorate中
 * 所声明的待装饰方法，其在遵循里氏原则的基础上可以自行动态扩展
 * 以装饰待装饰类
 * 为method1动态增加methodsub1，methodsub2，methodsub3
 * @author Administrator
 *
 */
public class Decorate1 extends Decorate{

	public void method1() {
		methodsub1();
		methodsub2();
		super.method1();
		methodsub3();
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
