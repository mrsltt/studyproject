package mrsl.jdkstudy.designpartten.factory;

import mrsl.jdkstudy.designpartten.factory.someClass.Somclass;
import mrsl.jdkstudy.designpartten.factory.someClass.SomeClass2;
/**
 * 工厂方法模式创建somclass2的工厂
 * @author Administrator
 *
 */
public class SomClassFactory2 implements IFactory{
	@Override
	public Somclass crateSomclass() {
		// TODO Auto-generated method stub
		return new SomeClass2();
	}
	
}
