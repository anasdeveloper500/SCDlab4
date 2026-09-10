/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package task3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class TreasureMapTest {

    @Test
    public void testCreateTreasureMap() {

        Map<String, Double> treasures = TreasureMap.createTreasureMap();

        assertEquals(25.0, treasures.get("beach"));
        assertEquals(53.0, treasures.get("palm"));
        assertEquals(75.0, treasures.get("cove"));
    }

    @Test
    public void testCalculateTotal() {

        Map<String, Double> treasures = new HashMap<>();

        treasures.put("beach", 25.0);
        treasures.put("palm", 53.0);
        treasures.put("cove", 75.0);

        double total = TreasureMap.calculateTotal(treasures);

        assertEquals(153.0, total);
    }

    @Test
    public void testTotalForEmptyMap() {

        Map<String, Double> treasures = new HashMap<>();

        double total = TreasureMap.calculateTotal(treasures);

        assertEquals(0.0, total);
    }
}
