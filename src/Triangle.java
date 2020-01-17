
public class Triangle {

	
	//ATTRIBUTES
	
	private int sideALength;
	private int sideBLength;
	private int sideCLength;
	private int x;
	private int y;
	
	//CONSTRUCTORS
	public Triangle() {}
	public Triangle(int a, int b, int c) {
		sideALength = a;
		sideBLength = b;
		sideCLength = c;
	}
	
	//BEHAVIORS
	public int getSideALength() {return sideALength;}
	public int getSideBLength() {return sideBLength;}
	public int getSideCLength() {return sideCLength;}
	public int getX() {return x;}
	public int getY() {return y;}
	
	public void setSideALength(int a) {
		if (a > 0) {
			sideALength = a;
		}
	}
	public void setSideBLength(int b) {
		if (b > 0) {
			sideBLength = b;
		}
	}
	public void setSideCLength(int c) {
		if (c > 0) {
			sideCLength = c;
		}
	}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	
	public int getPerimeter() {
		return sideALength + sideBLength + sideCLength;
	}
	
}
