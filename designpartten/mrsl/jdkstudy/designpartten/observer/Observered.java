package mrsl.jdkstudy.designpartten.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 被观察者对象
 * 一个被观察者对象定义了多个观察者，当观察者发布inform时，会依次调用
 * 其下多个观察者的update方法
 * @author Administrator
 *
 */
public abstract class Observered {
	
	protected List<Observer> observers = new ArrayList<Observer>();
	
	public void add(Observer observer) {
		this.observers.add(observer);
	}
	/**
	 * 被观察者的通知工作，针对不同的被观察者可以采用不同的策略通知观察者
	 * 本例就是调用update方法
	 */
	public abstract void inform();
	
	/**
	 * 当被观察者通知观察者后，观察者相应被观察者通知的行为
	 * 其实也就是observer中的update方法中的相应操作
	 * 不同的被观察者可以进行不同的操作
	 */
	public abstract String actionToObserver();
	

	public void delete(Observer observer) {
		Iterator<Observer> interator = this.observers.iterator();
		while(interator.hasNext()) {
			Observer next = interator.next();
			if(next.getID().equals(observer.getID())) {
				interator.remove();
			}
		}
	}
	
	public void update(Observer observer) {
		Iterator<Observer> interator = this.observers.iterator();
		boolean hasInOberver = false;
		while(interator.hasNext()) {
			Observer next = interator.next();
			if(next.getID().equals(observer.getID())) {
				interator.remove();
				hasInOberver = true;
			}
		}
		if(hasInOberver) {
			this.observers.add(observer);
		}
	}
}
