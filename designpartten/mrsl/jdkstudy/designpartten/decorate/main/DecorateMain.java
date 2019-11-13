package mrsl.jdkstudy.designpartten.decorate.main;

import mrsl.jdkstudy.designpartten.decorate.decorate.Decorateing1;
import mrsl.jdkstudy.designpartten.decorate.decorate.Decorateing11;
import mrsl.jdkstudy.designpartten.decorate.decorate.Decorateing2;
import mrsl.jdkstudy.designpartten.decorate.decorate.Decorateiong22;
import mrsl.jdkstudy.designpartten.decorate.decorated.DecoratedClass;
/**
 * װ��ģʽ����
 * ע��:װ��ģʽ��Ҫ��������������̳���һ���ӿ�
 * Ȼ�󲻶ϵĵ������װ�η������յ���ԭ�������Դﵽװ��Ŀ��
 * �Ķ���������һ��ԭ��
 * ���ǿ���ǰ��ĸ÷���Ȼ�󲻶ϵ�ȥ�ұ������(��װ��)�����еĸ÷���
 * 
 * 
 * 
 * ����˭�������ڶ�˭����װ�Σ�
 * @author Administrator
 *
 */
public class DecorateMain {

	public static void main(String[] args) {
		System.out.println("��װ����method1ԭ������");
		DecoratedClass decoratedClass = new DecoratedClass();
		decoratedClass.method1();
		
		System.out.println("��װ��1װ��ԭ��method1����");
		Decorateing1 decorate1 = new Decorateing1();
		decorate1.setComponent(decoratedClass);
		decorate1.method1();
		
		System.out.println("���ù��췽ʽ(io)��װ��1װ��ԭ��method1����");
		Decorateing11 decorate11 = new Decorateing11(decoratedClass);
		decorate11.method1();
		
		System.out.println("��װ����2װ��method1����");
		Decorateing2 decorate2 = new Decorateing2();
		decorate2.setComponent(decoratedClass);
		decorate2.method1();
		
		System.out.println("���ù��췽ʽ(io)��װ����2װ��method1����");
		Decorateiong22 decorate22 = new Decorateiong22(decoratedClass);
		decorate22.method1();
		/**
		 * �Ȼ�ȥִ��decorate2�е�method1�������Ż�ִ��decorate1�е�method1
		 * decorate1�е�method1�������žͻ�ִ��ԭ��method1�Դﵽװ��Ŀ��
		 */
		System.out.println("����װ����2װ��method1ԭ������������װ����1װ��װ����2");
		decorate2.setComponent(decorate1);
		decorate2.method1();
		
		System.out.println("���ù��췽ʽ(io)����װ����2װ��method1ԭ������������װ����1װ��װ����2");
		Decorateing11 decorate21 = new Decorateing11(decorate22);
		decorate21.method1();

	}
}
