/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package task4;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ZooTest {

    @Test
    public void testAnimalsList() {
        Zoo zoo = new Zoo();

        List<String> animals = zoo.getAnimals();

        assertEquals(
                Arrays.asList("lion", "tiger", "bear"),
                animals
        );
    }

    @Test
    public void testAnimalsListSize() {
        Zoo zoo = new Zoo();

        List<String> animals = zoo.getAnimals();

        assertEquals(3, animals.size());
    }

    @Test
    public void testFirstAnimal() {
        Zoo zoo = new Zoo();

        List<String> animals = zoo.getAnimals();

        assertEquals("lion", animals.get(0));
    }

    @Test
    public void testContainsTiger() {
        Zoo zoo = new Zoo();

        List<String> animals = zoo.getAnimals();

        assertTrue(animals.contains("tiger"));
    }

    @Test
    public void testAnimalsListIsUnmodifiable() {
        Zoo zoo = new Zoo();

        List<String> animals = zoo.getAnimals();

        assertThrows(
                UnsupportedOperationException.class,
                () -> animals.add("flamingo")
        );
    }

}