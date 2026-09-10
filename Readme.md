# Java Collections Lab 4

## Objective

The objective of this lab is to apply Java Collections concepts, including mutability, immutable objects, interface implementations such as `List`, `Map`, and `Set`, safe iterator traversal, and unmodifiable collection wrappers.

The lab also helps in understanding the difference between mutable and immutable objects and how Java Collections can be used safely in practical programs.

---

# Lab Tasks

## Lab Task 1 - Mutability & Performance

### Objective

The purpose of this task is to understand the difference between immutable `String` objects and the mutable `StringBuilder` class.

### Implementation

A class named `StringPerformance` was created with two methods:

* `buildString(int n)` uses a normal `String` and concatenates numbers using `s = s + i`.
* `buildStringBuilder(int n)` uses `StringBuilder` and `append()` to generate the same result.

The execution time of both methods was measured for `n = 10000`.

### Concept

`String` is immutable, which means every time we concatenate a new value, a new String object may be created.

`StringBuilder` is mutable, so it can modify the same object instead of creating many temporary String objects.

Therefore, `StringBuilder` is generally more efficient for repeated string modifications.

### Files

* `StringPerformance.java`
* `StringPerformanceTest.java`

### Testing

JUnit tests were created to verify that both methods produce the correct result.

---

# Lab Task 2 - Safe Collection Modification

## Objective

The purpose of this task is to understand how to safely remove elements from a collection while traversing it.

### Implementation

A `List<String>` named `subjects` was created with the following values:

```text
6.045
6.005
8.03
6.813
14.03
```

First, a for-each loop was used to remove subjects starting with `"6."`. This demonstrates the problem of modifying a collection while iterating over it and can result in a `ConcurrentModificationException`.

The problem was then fixed by using an `Iterator`.

The iterator uses:

```java
while (iter.hasNext())
```

and removes elements safely using:

```java
iter.remove();
```

### Expected Output

After removing all subjects starting with `"6."`, the final list is:

```text
[8.03, 14.03]
```

### Files

* `CourseManager.java`
* `CourseManagerTest.java`

---

# Lab Task 3 - Complex Data Types (Map)

## Objective

The purpose of this task is to understand how a `HashMap` can be used to store key-value pairs.

### Implementation

A `HashMap<String, Double>` named `treasures` was created:

```java
Map<String, Double> treasures = new HashMap<>();

treasures.put("beach", 25.0);
treasures.put("palm", 50.0);
treasures.put("cove", 75.0);
```

The value of `"palm"` was then updated by adding the current size of the map.

Since the map initially contains three entries:

```text
palm = 50.0 + 3
palm = 53.0
```

The values were also traversed using a for-each loop to calculate the total sum.

### Expected Result

The final values are:

```text
beach = 25.0
palm = 53.0
cove = 75.0
```

Total:

```text
153.0
```

### Files

* `TreasureMap.java`
* `TreasureMapTest.java`

---

# Lab Task 4 - Unmodifiable Wrappers

## Objective

The purpose of this task is to understand how a mutable collection can be exposed as a read-only collection using an unmodifiable wrapper.

### Implementation

A mutable list of animals was created:

```text
lion
tiger
bear
```

The list was passed to:

```java
Collections.unmodifiableList()
```

The unmodifiable list was then returned through the `getAnimals()` method.

When an attempt is made to add `"flamingo"` to the returned list, Java throws an `UnsupportedOperationException`.

### Expected Behavior

The original list can be modified internally, but the list returned by `getAnimals()` cannot be modified by the user.

Attempting:

```java
animals.add("flamingo");
```

on the returned unmodifiable list results in:

```text
UnsupportedOperationException
```

### Files

* `Zoo.java`
* `ZooTest.java`

---

# Homework 1 - Enhanced Map Tracking

## Objective

The purpose of this homework is to extend the use of Java `Map` and `Set` collections to maintain unique student records.

### Implementation

A class named `StudentDirectory` was created using:

```java
Map<Integer, String>
```

The student ID is used as the key and the student's name is stored as the value.

A method named:

```java
public Set<Integer> getAllIDs()
```

was implemented to return all student IDs.

The returned set is wrapped using:

```java
Collections.unmodifiableSet()
```

so that users cannot modify the original set through the returned reference.

### Expected Behavior

If a user tries to add or remove an ID from the returned set, an:

```text
UnsupportedOperationException
```

is thrown.

### Files

* `StudentDirectory.java`
* `StudentDirectoryTest.java`

---

# Homework 2 - Designing Immutable Classes

## Objective

The purpose of this homework is to understand how to design immutable classes using the `final` keyword and by removing mutator methods.

### Implementation

A fully immutable class named `Point` was created.

The class and its variables are declared as `final`.

The class contains:

```java
private final int x;
private final int y;
```

No setter or other mutator methods are provided.

The values of `x` and `y` are assigned when the object is created and cannot be changed afterward.

### Why is Point safer from bugs?

Making `Point` immutable makes it safer because its values cannot be changed after the object is created. This prevents unexpected changes to the object's state when it is passed between different methods or classes.

For example, if a `Point` object is created with `x = 10` and `y = 20`, these values remain the same throughout the object's lifetime.

Immutability reduces accidental modification and makes the class easier to understand, test, and use safely.

### Files

* `Point.java`
* `PointTest.java`

---

# Technologies Used

* Java
* Maven
* JUnit 5
* Java Collections Framework
* NetBeans IDE
* Git
* GitHub

---

# Collections Used

The following Java Collections concepts were used in this lab:

| Collection / Concept             | Purpose                                        |
| -------------------------------- | ---------------------------------------------- |
| `List`                           | Store an ordered collection of subjects        |
| `Iterator`                       | Safely remove elements while traversing a list |
| `Map`                            | Store key-value pairs                          |
| `HashMap`                        | Implement the treasure map                     |
| `Set`                            | Store unique student IDs                       |
| `String`                         | Demonstrate immutability                       |
| `StringBuilder`                  | Demonstrate mutability and better performance  |
| `Collections.unmodifiableList()` | Create a read-only list                        |
| `Collections.unmodifiableSet()`  | Create a read-only set                         |

---

# How to Run the Project

## 1. Clone the Repository

Clone this public GitHub repository to your computer.

```bash
git clone https://github.com/anasdeveloper500/SCDlab4
```

## 2. Open the Project

Open the project in NetBeans as a Maven project.

Make sure the project contains:

```text
src
├── main
│   └── java
└── test
    └── java
```

## 3. Build the Project

Right-click the project in NetBeans and select:

```text
Clean and Build
```

The project should build successfully.

## 4. Run the Tests

Right-click the project and select:

```text
Test
```

JUnit tests will run for the implemented classes.

Individual test classes can also be run by right-clicking the test file and selecting:

```text
Test File
```

## 5. Run the Programs

Classes containing a `main()` method can be run directly from NetBeans.

For example:

```text
StringPerformance.java
```

prints the execution time of `String` and `StringBuilder`.

---

# Testing

JUnit 5 tests were written to verify the functionality of the implemented classes.

The tests check:

* Correct String generation
* Correct StringBuilder generation
* Equality of both methods' results
* Correct removal of subjects
* Safe iterator-based modification
* Correct treasure map values
* Correct calculation of the treasure total
* `UnsupportedOperationException` for unmodifiable lists
* `UnsupportedOperationException` for unmodifiable student ID sets
* Correct behavior of the immutable `Point` class

All tests should pass successfully after the implementation is completed.

---

# Reflection

During this lab, I learned how Java Collections such as `List`, `Map`, and `Set` are used to store and manage different types of data. I also learned the difference between mutable and immutable objects by comparing `String` with `StringBuilder`. The iterator task helped me understand why directly modifying a collection during a for-each loop can cause a `ConcurrentModificationException` and how `Iterator.remove()` provides a safe solution. I also learned how `Collections.unmodifiableList()` and `Collections.unmodifiableSet()` can prevent users from modifying collections. Designing the immutable `Point` class helped me understand how the `final` keyword and the absence of setter methods can make objects safer from accidental changes. One challenge was understanding the difference between modifying a collection and safely traversing it. In the future, I would improve the implementation by adding more test cases and handling additional edge cases.

---

# Conclusion

This lab provided practical experience with Java Collections, mutability, immutability, iterators, maps, sets, and unmodifiable collection wrappers. The tasks demonstrated how these concepts can be used to write safer, more efficient, and easier-to-maintain Java programs.

