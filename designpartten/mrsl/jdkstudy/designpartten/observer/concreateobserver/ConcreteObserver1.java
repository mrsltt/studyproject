package mrsl.jdkstudy.designpartten.observer.concreateobserver;

import mrsl.jdkstudy.designpartten.observer.Observer;
/**
 * ����۲���1
 */
public class ConcreteObserver1 extends Observer{

	private String name="����۲���1";
	
	@Override
	public void update() {
		name+=super.observered.actionToObserver();
	}

	@Override
	public void setID(String id) {
		// TODO Auto-generated method stub
		super.id=id;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return super.id;
	}

	public void doSomthing() {
		System.out.println(name+"��������");
	}
}
