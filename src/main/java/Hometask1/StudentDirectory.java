/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hometask1;

/**
 *
 * @author DELL
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDirectory {

    private Map<Integer, String> students;

    public StudentDirectory() {
        students = new HashMap<>();

        students.put(101, "Ali");
        students.put(102, "Ahmed");
        students.put(103, "Sara");
    }

    public Set<Integer> getAllIDs() {
        return Collections.unmodifiableSet(students.keySet());
    }

    public String getStudentName(int id) {
        return students.get(id);
    }

    public int getStudentCount() {
        return students.size();
    }

    public static void main(String[] args) {

        StudentDirectory directory = new StudentDirectory();

        System.out.println("Student IDs: " + directory.getAllIDs());
        System.out.println("Student with ID 101: "
                + directory.getStudentName(101));
        System.out.println("Total students: "
                + directory.getStudentCount());

        try {
            directory.getAllIDs().add(104);
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException occurred!");
            System.out.println("Student ID set cannot be modified.");
        }
    }
}
