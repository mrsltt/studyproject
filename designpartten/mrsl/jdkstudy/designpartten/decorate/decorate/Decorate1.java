package mrsl.jdkstudy.designpartten.decorate.decorate;

import mrsl.jdkstudy.designpartten.decorate.def.Decorate;

/**
 * װ��1�࣬ע��������̳�Decorate������װ������Decorate��
 * �������Ĵ�װ�η�����������ѭ����ԭ��Ļ����Ͽ������ж�̬��չ
 * ��װ�δ�װ����
 * Ϊmethod1��̬����methodsub1��methodsub2��methodsub3
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
