/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author DELL
 */

public class StringPerformance {

    public static String buildString(int n) {
        String s = "";

        for (int i = 0; i <= n; i++) {
            s = s + i;
        }

        return s;
    }

    public static String buildStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            sb.append(i);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        int n = 10000;

        long startTime = System.nanoTime();
        buildString(n);
        long endTime = System.nanoTime();

        long stringTime = endTime - startTime;

        startTime = System.nanoTime();
        buildStringBuilder(n);
        endTime = System.nanoTime();

        long stringBuilderTime = endTime - startTime;

        System.out.println("n = " + n);
        System.out.println("String time: " + stringTime + " ns");
        System.out.println("StringBuilder time: " + stringBuilderTime + " ns");
    }
}
