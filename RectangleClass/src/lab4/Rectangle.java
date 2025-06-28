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
	
	public double area() {
		return A.distance(B) * B.distance(C);
	}
	
	public boolean square() {
		return A.distance(B) == B.distance(C);
	}
}