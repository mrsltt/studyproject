package mrsl.jdkstudy.designpartten.observer.concreateobservered;

import mrsl.jdkstudy.designpartten.observer.Observer;
import mrsl.jdkstudy.designpartten.observer.Observered;

/**
 * ���۲���1
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
 * �����۲���֪ͨ�۲��ߺ󣬹۲�����Ӧ���۲���֪ͨ����Ϊ
 * ��ʵҲ����observer�е�update�����е���Ӧ����
 */
	@Override
	public String actionToObserver() {
		return "���۲���1�����仯��";
	}
	
}
