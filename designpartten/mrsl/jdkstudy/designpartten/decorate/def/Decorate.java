package mrsl.jdkstudy.designpartten.decorate.def;

/**
 * �����������װ����Ļ��࣬
 * ����װ�����ʵ�ֱ���̳д��ಢʵ����Ӧ��װ�η���
 * �Ҹ��������˾�����Щ����Ҫװ��
 * @author Administrator
 *
 */
public abstract class Decorate implements Component{

	private Component comp;
	
	
	public void setComponent(Component comp) {
		this.comp = comp;
	}
	
	@Override
	public void method1() {
		comp.method1();
	}
	
	
}
