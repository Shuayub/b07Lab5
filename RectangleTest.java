package lab4;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testSquare1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 3);
		Point p3 = new Point(3, 0);
		Rectangle t1 = new Rectangle(p1, p2, p3);
		assertTrue(t1.square());
	}
	
	@Test
	void testSquare2() {
		Point p1 = new Point(0, 3);
		Point p2 = new Point(4, 2);
		Point p3 = new Point(0, 13);
		Rectangle t1 = new Rectangle(p1, p2, p3);
		assertFalse(t1.square());
	}
	
	@Test
	void testPerimeter() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(4, 3);
		Point p3 = new Point(3, 4);
		Rectangle t1 = new Rectangle(p1, p2, p3);
		assertEquals(t1.perimeter(), 5 + (Math.sqrt(2) * 2));
	}
	
	@Test
	void testArea() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(4, 3);
		Point p3 = new Point(3, 4);
		Rectangle t1 = new Rectangle(p1, p2, p3);
		assertEquals(t1.area(), 5 * Math.sqrt(2));
	}

}
