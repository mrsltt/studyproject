package mrsl.jdkstudy.designpartten.builder.concretbuilder;

import mrsl.jdkstudy.designpartten.builder.Builder;
import mrsl.jdkstudy.designpartten.builder.product.Product1;
import mrsl.jdkstudy.designpartten.builder.product.Product2;
/**
 * 具体的建造者对象1
 * @author Administrator
 *
 */
public class ConcreteBuilder1 implements Builder{

	private Product1 product1 = new Product1();
	private Product2 product2 = new Product2();
	
	@Override
	public void buildMethod1() {
		product1.getPart().add("建造者1用1方法对产品1进行了操作");
		product2.getPart().add("建造者1用1方法对产品2进行了操作");
		
	}

	@Override
	public void buildMethod2() {
		// TODO Auto-generated method stub
		product1.getPart().add("建造者1用2方法对产品1进行了操作");
		product2.getPart().add("建造者1用2方法对产品2进行了操作");
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
