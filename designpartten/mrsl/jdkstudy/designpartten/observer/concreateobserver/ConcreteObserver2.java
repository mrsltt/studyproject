package mrsl.jdkstudy.designpartten.observer.concreateobserver;

import mrsl.jdkstudy.designpartten.observer.Observer;

/**
 * 具体观察者2
 * @author Administrator
 *
 */
public class ConcreteObserver2 extends Observer{
private String name="具体观察者2";
	
	@Override
	public void update() {
		name+=super.observered.actionToObserver();
	}

	@Override
	public void setID(String id) {
		super.id = id;
		
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return super.id;
	}

	public void doSomthing() {
		System.out.println(name+"正在做事");
	}
}
