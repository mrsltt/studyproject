package mrsl.jdkstudy.designpartten.observer;
/**
 * �۲��߶������о���۲��߱���ʵ��update���������ڵ����۲��߷���֪ͨʱ������Ӧ�Ĳ���
 * �����е�id�����ڱ�ʶ��ͬ�Ĺ۲�����������
 * @author Administrator
 *
 */
public abstract class Observer {
//����һ��id����Ψһ��ʶ���۲���
	public String id;
	
	//����۲��߹۲�ľ��屻�۲���
	public Observered observered;
	
	public abstract void update();
	
	/**
	 * ��id��setget������ȥʵ�֣������ڳ������й涨���Է���۲��߿���ȡ��������������
	 */
	public abstract void setID(String id);
	public abstract String getID();
	
	//�������ı��۲���(�۲����ڹ۲�˭)
	public void setObserved(Observered observered) {
		this.observered = observered;
	}
	
	
	
}
