package mrsl.jdkstudy.designpartten.builder.concretbuilder;

import mrsl.jdkstudy.designpartten.builder.Builder;

/**
 * ָ���ߣ����ڹ�����������࣬���ڶԴ�����������ؾ��彨��ϸ�ڣ�ֻ��Ҫ������Ľ����ߴ��뼴�ɽ��н���
 * @author Administrator
 *
 */
public class Director {
/**
 * ����1��ʽ���ý�����
 */
	public static void construct1(Builder build) {
		/**
		 * ����
		 */
			build.buildMethod1();
			build.buildMethod2();
			build.buildMethod1();
			build.buildMethod2();
			build.buildMethod1();
			build.buildMethod2();
	}
	
}
