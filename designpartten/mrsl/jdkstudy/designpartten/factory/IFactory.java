package mrsl.jdkstudy.designpartten.factory;

import mrsl.jdkstudy.designpartten.factory.someClass.Somclass;

/**
 * 工厂方法模式的接口
 * 就是将工厂模式通过多态的方式
 * 将每一个创建方法单独提出成一个工厂
 * 以达到进一步的解耦，福永
 * @author Administrator
 *
 */
public interface IFactory {

	public abstract Somclass crateSomclass();
	
	
}
