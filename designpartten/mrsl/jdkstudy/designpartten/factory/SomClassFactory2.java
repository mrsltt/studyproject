package mrsl.jdkstudy.designpartten.factory;

import mrsl.jdkstudy.designpartten.factory.someClass.Somclass;
import mrsl.jdkstudy.designpartten.factory.someClass.SomeClass2;
/**
 * ��������ģʽ����somclass2�Ĺ���
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
