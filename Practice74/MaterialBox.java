//��ǻ���а� 20190975 ��ȿ��
public class MaterialBox extends Box{
	private String attribute;
	int x2, y2, z2;
	
	public void setAttribute(String material) { this.attribute = material; }
	public String getAttribute () { return attribute; }
	
	public MaterialBox (int x, int y, int z, String a) { //������(constructor��ȯ'Ÿ��' ����
		super(x, y, z) ;
		x2 = x;
		y2 = y;
		z2 = z;
		this.attribute = a;
	}
	@Override
	public double getWeight() {
		if (attribute.equals("wood"))
			return getVolume() * 2.5;
		else if (attribute.equals("paper"))
			return getVolume() * 1.5;
		else
			return getVolume() * 1.1;
	}
	@Override
	public String toString() {
		return "����: "+x2+", ����: "+y2+", ����: "+z2+
				"\n����: "+getVolume()+"\n����: "+getWeight()+"\n����: "+getAttribute();
	}
}
