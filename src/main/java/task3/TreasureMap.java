/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author DELL
 */
import java.util.HashMap;
import java.util.Map;

public class TreasureMap {

    public static Map<String, Double> createTreasureMap() {

        Map<String, Double> treasures = new HashMap<>();

        treasures.put("beach", 25.0);
        treasures.put("palm", 50.0);
        treasures.put("cove", 75.0);

        // Update palm value by adding the current map size
        treasures.put("palm", treasures.get("palm") + treasures.size());

        return treasures;
    }

    public static double calculateTotal(Map<String, Double> treasures) {

        double total = 0.0;

        for (Double value : treasures.values()) {
            total += value;
        }

        return total;
    }

    public static void main(String[] args) {

        Map<String, Double> treasures = createTreasureMap();

        System.out.println("Treasure Map: " + treasures);

        double total = calculateTotal(treasures);

        System.out.println("Total treasure value: " + total);
    }
}
