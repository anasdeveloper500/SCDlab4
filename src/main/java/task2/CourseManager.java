/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CourseManager {

    public static List<String> removeUsingForEach(List<String> subjects) {

        try {
            for (String subject : subjects) {
                if (subject.startsWith("6.")) {
                    subjects.remove(subject);
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException occurred!");
        }

        return subjects;
    }

    public static List<String> removeUsingIterator(List<String> subjects) {

        Iterator<String> iter = subjects.iterator();

        while (iter.hasNext()) {
            String subject = iter.next();

            if (subject.startsWith("6.")) {
                iter.remove();
            }
        }

        return subjects;
    }

    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>(
                Arrays.asList("6.045", "6.005", "8.03", "6.813", "14.03")
        );

        System.out.println("Original list: " + subjects);

        removeUsingForEach(subjects);

        System.out.println("After for-each attempt: " + subjects);

        subjects = new ArrayList<>(
                Arrays.asList("6.045", "6.005", "8.03", "6.813", "14.03")
        );

        removeUsingIterator(subjects);

        System.out.println("After Iterator removal: " + subjects);
    }
}
