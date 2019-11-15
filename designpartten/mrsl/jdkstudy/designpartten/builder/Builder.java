package mrsl.jdkstudy.designpartten.builder;

import mrsl.jdkstudy.designpartten.builder.product.Product1;
import mrsl.jdkstudy.designpartten.builder.product.Product2;

/**
 * ����ģʽ�ӿڣ����������жԲ�Ʒ���н���ÿ�������ķ���(���ڸ�ָ������в���)������ǿ�й涨�˵õ��ò�Ʒ�ķ���(���������)(���ڵõ��������)
 * �����Ƕ�product1��product2���н��죬�������ǽ������
 * 
 * 
 * ���彨������ڽ������ж��壨����ӿ�ֻ�涨�˶Բ�Ʒ����ÿһ���ֽ���Ĺ涨,ͬʱ�涨�˱����������˭����һ��ʲô���ķ�ʽ���н��죬��ָ�����ж��壩
 * �籾������Ҫ��һ���ַ������н���(ʵ��Ӧ�ÿ����Ǹ��Ӷ���)
 * @author Administrator
 *
 */
public interface Builder {

	/**
	 * �Դ����������з���1�Ľ���
	 */
	public abstract void buildMethod1();
	
	/**
	 * �Դ����������з���2�Ľ���
	 */
	
	public abstract void buildMethod2();
	
	
	/**
	 * �õ��������1
	 * 
	 */
	public Product1 getProduct1();
	/**
	 * �õ��������2
	 * 
	 */
	public Product2 getProduct2();
	
}
