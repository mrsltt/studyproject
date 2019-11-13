package mrsl.jdkstudy.designpartten.factory.main;

import mrsl.jdkstudy.designpartten.factory.IFactory;
import mrsl.jdkstudy.designpartten.factory.SimpleFactory;
import mrsl.jdkstudy.designpartten.factory.SomClassFactory1;
import mrsl.jdkstudy.designpartten.factory.SomClassFactory2;
import mrsl.jdkstudy.designpartten.factory.someClass.Somclass;

/**
 * ��������������
 * @author Administrator
 *
 */
public class FactoryMain {

	public static void main(String[] args) {
		//�򵥹���ģʽ����12
		Somclass somclass1 = SimpleFactory.getSomclass(1);
		somclass1.doSomthing();
		Somclass somclass2 = SimpleFactory.getSomclass(2);
		somclass2.doSomthing();
		//��������ģʽ����12
		IFactory factory1 = new SomClassFactory1();
		IFactory factory2 = new SomClassFactory2();
		factory1.crateSomclass().doSomthing();
		factory2.crateSomclass().doSomthing();
		
	}
	
}
