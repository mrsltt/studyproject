package mrsl.jdkstudy.designpartten.builder.concretbuilder;

import mrsl.jdkstudy.designpartten.builder.Builder;

/**
 * 指挥者，用于构建建造这的类，用于对代码调用者隐藏具体建造细节，只需要将具体的建造者传入即可进行建造
 * @author Administrator
 *
 */
public class Director {
/**
 * 采用1方式调用建造者
 */
	public static void construct1(Builder build) {
		/**
		 * 对于
		 */
		if(build instanceof ConcreteBuilder1) {
			build.buildMethod1();
			build.buildMethod2();
			build.buildMethod1();
			build.buildMethod2();
			build.buildMethod1();
			build.buildMethod2();
		}else {
			build.buildMethod1();
			build.buildMethod2();
			build.buildMethod1();
			build.buildMethod2();
			build.buildMethod1();
			build.buildMethod2();
			build.buildMethod1();
			build.buildMethod2();
		}
	}
	
}
