/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Hometask1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class StudentDirectoryTest {

    @Test
    public void testGetAllIDs() {
        StudentDirectory directory = new StudentDirectory();

        Set<Integer> ids = directory.getAllIDs();

        assertEquals(3, ids.size());
        assertTrue(ids.contains(101));
        assertTrue(ids.contains(102));
        assertTrue(ids.contains(103));
    }

    @Test
    public void testGetStudentName() {
        StudentDirectory directory = new StudentDirectory();

        assertEquals("Ali", directory.getStudentName(101));
    }

    @Test
    public void testAnotherStudentName() {
        StudentDirectory directory = new StudentDirectory();

        assertEquals("Ahmed", directory.getStudentName(102));
    }

    @Test
    public void testStudentCount() {
        StudentDirectory directory = new StudentDirectory();
        assertEquals(3, directory.getStudentCount());
    }

    @Test
    public void testIDsSetIsUnmodifiable() {
        StudentDirectory directory = new StudentDirectory();

        Set<Integer> ids = directory.getAllIDs();
        assertThrows(
                UnsupportedOperationException.class,
                () -> ids.add(104)
        );
    }
}
