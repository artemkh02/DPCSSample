 
public class Circle {

	//ATTRIBUTES AND FIELDS
	private double rad;
	private int x;
	private int y;
	private final double PI = Math.PI;
	
	
	//CONSTRUCTORS
	public Circle() { }
	public Circle(int r) {rad = r;}
	
	public Circle(int r, int x, int y) {
		rad = r;
		this.x = x;
		this.y = y;
	}
	//BEHAVIORS
	public void changeRad(double scale) {
		rad = rad / scale;
	}
	public double getCirc() {
		return 2*PI*rad;
	}
	public double getRad() {
		return rad;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setRad(double r) {
		if (r >= 0) {
			rad = r;
		}
	}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}

	
}
