//��ǻ���а� 20190975 ��ȿ��
public class Undergraduate extends Student{
	private int year;
	
	Undergraduate(){//�ʱ�ȭ
		super();
		this.year = 0;
	}
	Undergraduate(int year){
		super(2222, 100, 4.1);
		this.year = year;
	}
	@Override
	public int calcScholarship() {
		return super.calcScholarship() + (int)(getTuition() * 0.1);
	}
	public String toString() {
		return "�й�: "+getId()+", ��ϱ�: "+getTuition()+", ��յ��: "+getGpa()+
					", ���б�: "+calcScholarship()+", �г� : "+year;
	}
}
