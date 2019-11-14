package mrsl.jdkstudy.designpartten.builder.concretbuilder;

import mrsl.jdkstudy.designpartten.builder.Builder;

/**
 * 根据类型返回具体的concreatebuilder对象
 * @author Administrator
 *
 */
public class BuilderFactory {

	public static Builder getBuilder(int type) {
		switch(type) {
			case 1:
				return new ConcreteBuilder1();
			case 2:
				return new ConcreteBuilder2();
			default :
				return null;
		}
	}
	
}
