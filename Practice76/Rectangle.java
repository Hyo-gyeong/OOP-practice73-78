//컴퓨터학과 20190975 신효경
public class Rectangle {
	private int width;
	private int height;
	public Boolean b = null;

	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	public int area() { return width * height;}
	
	public boolean isSmallerThan(Rectangle r) {
		if (area() > r.area()) {return true;}
		else {return false;}
	}
}