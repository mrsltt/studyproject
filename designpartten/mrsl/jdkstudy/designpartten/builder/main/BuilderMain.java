package mrsl.jdkstudy.designpartten.builder.main;

import mrsl.jdkstudy.designpartten.builder.Builder;
import mrsl.jdkstudy.designpartten.builder.concretbuilder.BuilderFactory;
import mrsl.jdkstudy.designpartten.builder.concretbuilder.ConcreteBuilder1;
import mrsl.jdkstudy.designpartten.builder.concretbuilder.Director;

/**
 * ������ģʽ���ã�ע��
 * ����Ľ��������Ѿ������˱���������뽨��ķ�����������ν�����ָ������ִ��
 * �����߼����Ǵ��������߶���Ȼ�󽻸�ָ���߽��ж��󹹽�
 * ͬһ����Ʒ1(���߲�Ʒ2)���Ը��ݲ�ͬ��builder���й���
 * ͬһ��builderҲ���Թ�����ͬ�Ĳ�Ʒ1��Ʒ2
 * ����������ָ����ֻ���𹹽�����builder�ķ������й����������ù�builder�о�����ζԲ�Ʒ���й�����
 * ����������ָ���߿��Ը��ݲ�ͬ��builder��ȡ��ͬ��ָ�Ӳ���
 * 
 * 
 * 
 * ָ���ߵ�ְ����ָ��builder���й���
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
