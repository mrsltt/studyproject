package mrsl.jdkstudy.designpartten.observer.concreateobservered;

import mrsl.jdkstudy.designpartten.observer.Observer;
import mrsl.jdkstudy.designpartten.observer.Observered;

/**
 * 被观察者1
 * @author Administrator
 *
 */
public class ConcreteObserved1 extends Observered{

	@Override
	public void inform() {
		for (Observer observer : super.observers) {
			observer.update();
		}
		
	}
/**
 * 当被观察者通知观察者后，观察者相应被观察者通知的行为
 * 其实也就是observer中的update方法中的相应操作
 */
	@Override
	public String actionToObserver() {
		return "被观察者1发生变化了";
	}
	
}
