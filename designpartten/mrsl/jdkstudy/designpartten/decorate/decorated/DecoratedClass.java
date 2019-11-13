package mrsl.jdkstudy.designpartten.decorate.decorated;

import mrsl.jdkstudy.designpartten.decorate.def.Component;

/**
 * 被装饰的类
 * 1 该类需要被装饰的方法，必须在component中声明，否则装饰类不知道要装饰的方法
 * @author Administrator
 *
 */
public class DecoratedClass implements Component{

	@Override
	public void method1() {
		System.out.println("do method1 something");
	}
	
}
