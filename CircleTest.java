package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void testConstructor1() {
        Circle x = new Circle(new Point(0,0), new Point(1,4));
        assertEquals(new Point(1,4), x.B);
    }


    @Test
    void testConstructor2() {
        Circle x = new Circle(new Point(0, 0), new Point(1, 4));
        assertEquals(new Point(0, 0), x.A);
    }
    @Test
    void testGetRadius1() {
        Circle x = new Circle(new Point(0, 0), new Point(4, 0));
        assertEquals(2.0, x.getRadius());
    }


    @Test
    void testGetRadius2() {
        Circle x = new Circle(new Point(0, 6), new Point(0, 0));
        assertEquals(3.0, x.getRadius());
    }

    @Test
    void testGetRadius3() {
        Circle x = new Circle(new Point(1, 1), new Point(1, 1));
        assertEquals(0.0, x.getRadius());
    }
    
    @Test
    void testGetRadius4() {
        Circle x = new Circle(new Point(0, 0), new Point(3, 4));
        assertEquals(2.5, x.getRadius());
    }

    @Test
    void testCircumference1() {
        Circle x = new Circle(new Point(0, 0), new Point(4, 0));
        assertEquals(4 * Math.PI, x.Circumference());
    }


    @Test
    void testCircumference2() {
        Circle x = new Circle(new Point(0, 0), new Point(3, 4)); 
        assertEquals(5 * Math.PI, x.Circumference());
    }

  
}