package mrsl.jdkstudy.designpartten.observer.main;

import mrsl.jdkstudy.designpartten.observer.concreateobserver.ConcreteObserver1;
import mrsl.jdkstudy.designpartten.observer.concreateobserver.ConcreteObserver2;
import mrsl.jdkstudy.designpartten.observer.concreateobservered.ConcreteObserved1;
/**
 * �۲���ģʽ������
 * ע
 * �۲����뱻�۲����Ƕ��һ����ʽ��һ�����۲��߷����仯����֪ͨ����������δ������µ����й۲��߷���
 * ��ˣ�һ�����۲����а����˶���۲��ߵ�ͬʱ���۲�����Ҳ���������Ӧ�ı��۲��ߡ�
 * �����Ǳ��۲��ߵ���inform���������ε���������۲����е�update������
 
 * @author Administrator
 *
 */
public class ObserverMain {

	public static void main(String[] args) {
		//���۲���1
		ConcreteObserved1 observered1 = new ConcreteObserved1();
		//�۲���1
		ConcreteObserver1 observer1 = new ConcreteObserver1();
		observer1.setID("1");
		observer1.doSomthing();
		//�۲���2
		ConcreteObserver2 observer2 = new ConcreteObserver2();
		observer2.setID("2");
		observer2.doSomthing();
		//�����۲���1�����۲���1��ͬʱҪ�ѹ۲���1���뱻�۲���1�Ĺ۲켯����
		observer1.setObserved(observered1);
		//�����۲���1�����۲���2��ͬʱҪ�ѹ۲���2���뱻�۲���1�Ĺ۲켯����
		observer2.setObserved(observered1);
		observered1.add(observer1);
		observered1.add(observer2);
		
		//����֪ͨ
		observered1.inform();
		observer2.doSomthing();
		observer1.doSomthing();
		//�Ƴ��۲���2���ٴη���֪ͨ���۲���2�����ٱ�֪ͨ��
		observered1.delete(observer2);
		observered1.inform();
		observer2.doSomthing();
		observer1.doSomthing();
		
	}
}
