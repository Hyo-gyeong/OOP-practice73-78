//��ǻ���а� 20190975 ��ȿ��
public class Graduate extends Student{
	private String lab;
	
	Graduate() {	//�ʱ�ȭ
		super();
		this.lab = "";
	}
	Graduate(String lab) {
		super(3333, 100, 3.4);
		this.lab = lab;
	}
	@Override
	public int calcScholarship() {
		if (getGpa() >= 3.5)
			return super.calcScholarship() + (int)(getTuition() * 0.2);
		else
			return super.calcScholarship();
	}
	public String toString() {
		return "�й�: "+getId()+", ��ϱ�: "+getTuition()+", ��յ��: "+getGpa()+
				", ���б�: "+calcScholarship()+", ������: "+lab;
	}
}
