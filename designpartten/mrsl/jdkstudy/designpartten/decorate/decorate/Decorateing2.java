package mrsl.jdkstudy.designpartten.decorate.decorate;

import mrsl.jdkstudy.designpartten.decorate.def.Decorate;

/**
 * װ��2�࣬ע��������̳�Decorate������װ������Decorate��
 * �������Ĵ�װ�η�����������ѭ����ԭ��Ļ����Ͽ������ж�̬��չ
 * ��װ�δ�װ����
 * Ϊmethod1 ����methodsub4��methodsub5��methodsub6
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
