/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package HomeTask2;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class PointTest {

    @Test
    public void testXCoordinate() {
        Point point = new Point(10, 20);

        assertEquals(10, point.getX());
    }

    @Test
    public void testYCoordinate() {
        Point point = new Point(10, 20);

        assertEquals(20, point.getY());
    }

    @Test
    public void testNegativeCoordinates() {
        Point point = new Point(-5, -10);

        assertEquals(-5, point.getX());
        assertEquals(-10, point.getY());
    }

    @Test
    public void testZeroCoordinates() {
        Point point = new Point(0, 0);

        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    public void testToString() {
        Point point = new Point(10, 20);

        assertEquals("Point(10, 20)", point.toString());
    }
}