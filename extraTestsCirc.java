package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class extraTestsCircle {

	   @Test
	    public void testGetRadius() {
	        Point A = new Point(0, 0);
	        Point B = new Point(4, 0);
	        Circle circle = new Circle(A, B);
	        assertEquals(2.0, circle.getRadius();
	    }

	    @Test
	    public void testGetDiagonalRadius() {
	        Point A = new Point(1, 1);
	        Point B = new Point(4, 5);
	        Circle circle = new Circle(A, B);
	        assertEquals(2.5, circle.getRadius());
	    }

	    @Test
	    public void testCircumference() {
	        Point A = new Point(0, 0);
	        Point B = new Point(0, 2); 
	        Circle circle = new Circle(A, B);
	        double expectedCircumference = 2 * Math.PI * 1;
	        assertEquals(expectedCircumference, circle.Circumference());
	    }
}
