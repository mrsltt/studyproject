package mrsl.jdkstudy.designpartten.builder.main;

import mrsl.jdkstudy.designpartten.builder.Builder;
import mrsl.jdkstudy.designpartten.builder.concretbuilder.BuilderFactory;
import mrsl.jdkstudy.designpartten.builder.concretbuilder.ConcreteBuilder1;
import mrsl.jdkstudy.designpartten.builder.concretbuilder.Director;

/**
 * 建造者模式调用，注意
 * 具体的建造类中已经包含了被建造对象与建造的方法，具体如何建造在指挥者中执行
 * 所以逻辑就是创建建造者对象，然后交给指挥者进行对象构建
 * 同一个产品1(或者产品2)可以根据不同的builder进行构建
 * 同一个builder也可以构建不同的产品1产品2
 * 不管怎样，指挥类只负责构建调用builder的方法进行构建，而不用管builder中具体如何对产品进行构建的
 * 甚至像本例，指挥者可以根据不同的builder采取不同的指挥策略
 * 
 * 
 * 
 * 指挥者的职责是指挥builder进行构建
 * @author Administrator
 *
 */
public class BuilderMain {

	public static void main(String[] args) {
		Builder builder1 = BuilderFactory.getBuilder(1);
		Builder builder2 = BuilderFactory.getBuilder(2);
		Director.construct1(builder1);
		Director.construct1(builder2);
		System.out.println(builder1.getProduct1());
		System.out.println(builder1.getProduct2());
		System.out.println(builder1.getProduct1());
		System.out.println(builder1.getProduct2());
		
	}
}
