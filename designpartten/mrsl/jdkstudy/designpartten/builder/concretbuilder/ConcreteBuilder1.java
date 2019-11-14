package mrsl.jdkstudy.designpartten.builder.concretbuilder;

import mrsl.jdkstudy.designpartten.builder.Builder;
import mrsl.jdkstudy.designpartten.builder.product.Product1;
import mrsl.jdkstudy.designpartten.builder.product.Product2;
/**
 * ����Ľ����߶���1
 * @author Administrator
 *
 */
public class ConcreteBuilder1 implements Builder{

	private Product1 product1 = new Product1();
	private Product2 product2 = new Product2();
	
	@Override
	public void buildMethod1() {
		product1.getPart().add("������1��1�����Բ�Ʒ1�����˲���");
		product2.getPart().add("������1��1�����Բ�Ʒ2�����˲���");
		
	}

	@Override
	public void buildMethod2() {
		// TODO Auto-generated method stub
		product1.getPart().add("������1��2�����Բ�Ʒ1�����˲���");
		product2.getPart().add("������1��2�����Բ�Ʒ2�����˲���");
	}

	@Override
	public Product1 getProduct1() {
		// TODO Auto-generated method stub
		return product1;
	}

	@Override
	public Product2 getProduct2() {
		// TODO Auto-generated method stub
		return product2;
	}

}
