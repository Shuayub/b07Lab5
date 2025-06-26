package lab4;

public class Rectangle {
	Point A;
	Point B;
	Point C;
	
	public Rectangle(Point A, Point B, Point C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public double perimeter() {
		return (A.distance(B) + B.distance(C))*2;
	}
}