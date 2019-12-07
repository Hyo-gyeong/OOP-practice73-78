//컴퓨터학과 20190975 신효경
public class Box {
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	public void fillBox() {empty = false;}
	public void emptyBox() {empty = true;}
	
	public Box(int x, int y, int z) {
		 this.x = x;
		 this.y = y;
		 this.z = z;
		 emptyBox();
	}
	 
	public int getVolume() {
		return x * y * z;			
	}
	public double getWeight() {
		return getVolume() * 1.1;
	}
	public String toString() {
		return "가로: "+x+", 세로: "+y+", 높이: "+z+"\n부피: "+getVolume()+"\n무게: "+getWeight();
	}
}
