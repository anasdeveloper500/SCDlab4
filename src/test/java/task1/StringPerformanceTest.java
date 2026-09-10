/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package task1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringPerformanceTest {

    @Test
    public void testBuildString() {
        assertEquals("012345", StringPerformance.buildString(5));
    }

    @Test
    public void testBuildStringBuilder() {
        assertEquals("012345", StringPerformance.buildStringBuilder(5));
    }

    @Test
    public void testBothMethodsProduceSameResult() {
        assertEquals(
                StringPerformance.buildString(100),
                StringPerformance.buildStringBuilder(100)
        );
    }
}