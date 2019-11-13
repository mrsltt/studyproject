package mrsl.jdkstudy.designpartten.decorate.main;

import mrsl.jdkstudy.designpartten.decorate.decorate.Decorateing1;
import mrsl.jdkstudy.designpartten.decorate.decorate.Decorateing11;
import mrsl.jdkstudy.designpartten.decorate.decorate.Decorateing2;
import mrsl.jdkstudy.designpartten.decorate.decorate.Decorateiong22;
import mrsl.jdkstudy.designpartten.decorate.decorated.DecoratedClass;
/**
 * 装饰模式测试
 * 注意:装饰模式主要就是利用所有类继承自一个接口
 * 然后不断的掉父类的装饰方法最终调到原声方法以达到装饰目的
 * 阅读这类代码的一个原则
 * 就是看当前类的该方法然后不断的去找被传入的(被装饰)的类中的该方法
 * 
 * 
 * 
 * 传入谁，就是在对谁进行装饰！
 * @author Administrator
 *
 */
public class DecorateMain {

	public static void main(String[] args) {
		System.out.println("被装饰类method1原声方法");
		DecoratedClass decoratedClass = new DecoratedClass();
		decoratedClass.method1();
		
		System.out.println("用装饰1装饰原声method1方法");
		Decorateing1 decorate1 = new Decorateing1();
		decorate1.setComponent(decoratedClass);
		decorate1.method1();
		
		System.out.println("采用构造方式(io)用装饰1装饰原声method1方法");
		Decorateing11 decorate11 = new Decorateing11(decoratedClass);
		decorate11.method1();
		
		System.out.println("用装饰器2装饰method1方法");
		Decorateing2 decorate2 = new Decorateing2();
		decorate2.setComponent(decoratedClass);
		decorate2.method1();
		
		System.out.println("采用构造方式(io)用装饰器2装饰method1方法");
		Decorateiong22 decorate22 = new Decorateiong22(decoratedClass);
		decorate22.method1();
		/**
		 * 先会去执行decorate2中的method1走着走着会执行decorate1中的method1
		 * decorate1中的method1走着走着就会执行原声method1以达到装饰目的
		 */
		System.out.println("先用装饰器2装饰method1原声方法，再用装饰器1装饰装饰器2");
		decorate2.setComponent(decorate1);
		decorate2.method1();
		
		System.out.println("采用构造方式(io)先用装饰器2装饰method1原声方法，再用装饰器1装饰装饰器2");
		Decorateing11 decorate21 = new Decorateing11(decorate22);
		decorate21.method1();

	}
}
