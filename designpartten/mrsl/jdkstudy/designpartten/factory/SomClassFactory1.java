package mrsl.jdkstudy.designpartten.factory;

import mrsl.jdkstudy.designpartten.factory.someClass.Somclass;
import mrsl.jdkstudy.designpartten.factory.someClass.SomeClass1;
/**
 * 工厂方法模式创建somclass1的工厂
 * @author Administrator
 *
 */
public class SomClassFactory1 implements IFactory{
	@Override
	public Somclass crateSomclass() {
		return new SomeClass1();
	}
}
