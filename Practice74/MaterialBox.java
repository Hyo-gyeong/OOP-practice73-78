//컴퓨터학과 20190975 신효경
public class MaterialBox extends Box{
	private String attribute;
	int x2, y2, z2;
	
	public void setAttribute(String material) { this.attribute = material; }
	public String getAttribute () { return attribute; }
	
	public MaterialBox (int x, int y, int z, String a) { //생성자(constructor반환'타입' 없음
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
		return "가로: "+x2+", 세로: "+y2+", 높이: "+z2+
				"\n부피: "+getVolume()+"\n무게: "+getWeight()+"\n재질: "+getAttribute();
	}
}
