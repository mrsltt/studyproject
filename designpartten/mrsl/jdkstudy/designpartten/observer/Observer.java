package mrsl.jdkstudy.designpartten.observer;
/**
 * 观察者对象，所有具体观察者必须实现update方法，用于当被观察者发起通知时进行相应的操作
 * 本例中的id是用于标识不同的观察者用于区分
 * @author Administrator
 *
 */
public abstract class Observer {
//定义一个id用于唯一标识被观察者
	public String id;
	
	//定义观察者观察的具体被观察者
	public Observered observered;
	
	public abstract void update();
	
	/**
	 * 对id的setget让子类去实现，并且在抽象类中规定，以方便观察者可以取到下面两个方法
	 */
	public abstract void setID(String id);
	public abstract String getID();
	
	//定义具体的被观察者(观察者在观察谁)
	public void setObserved(Observered observered) {
		this.observered = observered;
	}
	
	
	
}
