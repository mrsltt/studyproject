package mrsl.jdkstudy.designpartten.builder;

import mrsl.jdkstudy.designpartten.builder.product.Product1;
import mrsl.jdkstudy.designpartten.builder.product.Product2;

/**
 * 建造模式接口，定义了所有对产品进行建造每个部件的方法(用于给指挥类进行操作)，并且强行规定了得到该产品的方法(待建造对象)(用于得到建造对象)
 * 本例是对product1与product2进行建造，这两个是建造对象
 * 
 * 
 * 具体建造对象在建造类中定义（建造接口只规定了对产品进行每一部分建造的规定,同时规定了被建造对象是谁，以一个什么样的方式进行建造，在指挥类中定义）
 * 如本例，需要对一个字符串进行建造(实际应用可能是复杂对象)
 * @author Administrator
 *
 */
public interface Builder {

	/**
	 * 对待建造对象进行方法1的建造
	 */
	public abstract void buildMethod1();
	
	/**
	 * 对待建造对象进行方法2的建造
	 */
	
	public abstract void buildMethod2();
	
	
	/**
	 * 得到建造对象1
	 * 
	 */
	public Product1 getProduct1();
	/**
	 * 得到建造对象2
	 * 
	 */
	public Product2 getProduct2();
	
}
