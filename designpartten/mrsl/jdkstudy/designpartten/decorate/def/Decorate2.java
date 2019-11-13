package mrsl.jdkstudy.designpartten.decorate.def;

/**
 * 同样装饰decoratedclass的method1方法的装饰类
 * 仿照io的形式
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
