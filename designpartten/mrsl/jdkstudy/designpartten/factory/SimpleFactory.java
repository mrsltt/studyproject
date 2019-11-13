package mrsl.jdkstudy.designpartten.factory;

import mrsl.jdkstudy.designpartten.factory.someClass.Somclass;
import mrsl.jdkstudy.designpartten.factory.someClass.SomeClass1;
import mrsl.jdkstudy.designpartten.factory.someClass.SomeClass2;
/**
 * �򵥹���ģʽ���������ͷ��ؾ���ʵ����
 * @author Administrator
 *
 */
public class SimpleFactory {

	public static Somclass getSomclass(int type) {
		switch(type){
			case 1:
				return new SomeClass1();
			case 2:
				return new SomeClass2();
			default:
				return null;
		}
	}
	
}
