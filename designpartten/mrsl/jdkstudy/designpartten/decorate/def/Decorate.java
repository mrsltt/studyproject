package mrsl.jdkstudy.designpartten.decorate.def;

/**
 * 这个类是所有装饰类的基类，
 * 所有装饰类的实现必须继承此类并实现相应的装饰方法
 * 且该类声明了究竟哪些类需要装饰
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
