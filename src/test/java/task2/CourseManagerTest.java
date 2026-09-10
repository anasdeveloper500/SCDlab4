/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package task2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CourseManagerTest {

    @Test
    public void testRemoveUsingIterator() {

        List<String> subjects = new ArrayList<>(
                Arrays.asList("6.045", "6.005", "8.03", "6.813", "14.03")
        );

        List<String> result = CourseManager.removeUsingIterator(subjects);

        List<String> expected = Arrays.asList("8.03", "14.03");

        assertEquals(expected, result);
    }

    @Test
    public void testIteratorDoesNotRemoveNonMatchingSubjects() {

        List<String> subjects = new ArrayList<>(
                Arrays.asList("8.03", "14.03")
        );

        List<String> result = CourseManager.removeUsingIterator(subjects);

        assertEquals(
                Arrays.asList("8.03", "14.03"),
                result
        );
    }

    @Test
    public void testIteratorRemovesAllSixCourses() {

        List<String> subjects = new ArrayList<>(
                Arrays.asList("6.045", "6.005", "6.813")
        );

        List<String> result = CourseManager.removeUsingIterator(subjects);

        assertTrue(result.isEmpty());
    }
}
