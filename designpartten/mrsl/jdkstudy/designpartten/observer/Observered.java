package mrsl.jdkstudy.designpartten.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ���۲��߶���
 * һ�����۲��߶������˶���۲��ߣ����۲��߷���informʱ�������ε���
 * ���¶���۲��ߵ�update����
 * @author Administrator
 *
 */
public abstract class Observered {
	
	protected List<Observer> observers = new ArrayList<Observer>();
	
	public void add(Observer observer) {
		this.observers.add(observer);
	}
	/**
	 * ���۲��ߵ�֪ͨ��������Բ�ͬ�ı��۲��߿��Բ��ò�ͬ�Ĳ���֪ͨ�۲���
	 * �������ǵ���update����
	 */
	public abstract void inform();
	
	/**
	 * �����۲���֪ͨ�۲��ߺ󣬹۲�����Ӧ���۲���֪ͨ����Ϊ
	 * ��ʵҲ����observer�е�update�����е���Ӧ����
	 * ��ͬ�ı��۲��߿��Խ��в�ͬ�Ĳ���
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
