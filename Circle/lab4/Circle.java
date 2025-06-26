package lab4;

public class Circle {
	Point A;
	Point B;
	
	public Circle(Point A, Point B) {
		this.A = A;
		this.B = B;
	}
	
	public double getRadius() {
		return A.distance(B)/2;
	}
	
	public double Circumference() {
		return Math.PI*(this.getRadius())*2;
	}
}
