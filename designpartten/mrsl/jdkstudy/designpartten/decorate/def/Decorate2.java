package mrsl.jdkstudy.designpartten.decorate.def;

/**
 * ͬ��װ��decoratedclass��method1������װ����
 * ����io����ʽ
 * @author Administrator
 *
 */
public  class Decorate2 implements Component{
	private Component comp;
	
	public Decorate2(Component comp) {
		this.comp = comp;
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		comp.method1();
	}

	
}
