package mrsl.jdkstudy.designpartten.observer.main;

import mrsl.jdkstudy.designpartten.observer.concreateobserver.ConcreteObserver1;
import mrsl.jdkstudy.designpartten.observer.concreateobserver.ConcreteObserver2;
import mrsl.jdkstudy.designpartten.observer.concreateobservered.ConcreteObserved1;
/**
 * 观察者模式测试类
 * 注
 * 观察者与被观察者是多对一的形式，一个被观察者发生变化调用通知方法后会依次触发旗下的所有观察者方法
 * 因此，一个被观察者中包含了多个观察者的同时，观察者中也必须包含相应的被观察者。
 * 核心是被观察者调用inform方法后，依次调用其关联观察者中的update方法，
 
 * @author Administrator
 *
 */
public class ObserverMain {

	public static void main(String[] args) {
		//被观察者1
		ConcreteObserved1 observered1 = new ConcreteObserved1();
		//观察者1
		ConcreteObserver1 observer1 = new ConcreteObserver1();
		observer1.setID("1");
		observer1.doSomthing();
		//观察者2
		ConcreteObserver2 observer2 = new ConcreteObserver2();
		observer2.setID("2");
		observer2.doSomthing();
		//将被观察者1关联观察者1的同时要把观察者1加入被观察者1的观察集合中
		observer1.setObserved(observered1);
		//将被观察者1关联观察者2的同时要把观察者2加入被观察者1的观察集合中
		observer2.setObserved(observered1);
		observered1.add(observer1);
		observered1.add(observer2);
		
		//发起通知
		observered1.inform();
		observer2.doSomthing();
		observer1.doSomthing();
		//移除观察者2后再次发起通知（观察者2将不再被通知）
		observered1.delete(observer2);
		observered1.inform();
		observer2.doSomthing();
		observer1.doSomthing();
		
	}
}
