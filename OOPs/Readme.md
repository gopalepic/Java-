# Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects", which encapsulate data (fields/attributes) and behavior (methods/functions). OOP helps organize code for better modularity, reusability, and maintainability.

## Key Concepts of OOP

### 1. Class
A **class** is a blueprint for creating objects. It defines the properties (fields) and behaviors (methods) that its objects will have.

- **Superclass (Parent Class):** The class being inherited from.
- **Subclass (Child Class):** The class that inherits from another class.

```java
class Animal { // Superclass
    String name;
    void eat() {
        System.out.println(name + " is eating.");
    }
}
```

### 2. Object
An **object** is an instance of a class. It represents a real-world entity and has its own state and behavior.

```java
Animal dog = new Animal(); // Creating an object
dog.name = "Dog";
dog.eat();
```

### 3. Inheritance
**Inheritance** allows a subclass to inherit fields and methods from a superclass, promoting code reuse.

- **Syntax:** `class Subclass extends Superclass`
- **final keyword:** If a class is declared as `final`, it cannot be subclassed.
- **Exceptions:** Java does not support multiple inheritance with classes (but interfaces can be used).

```java
class Dog extends Animal { // Dog is a subclass, Animal is a superclass
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Using final keyword
final class Cat extends Animal {
    // No class can extend Cat
}
```

### 4. Polymorphism
**Polymorphism** enables objects to be treated as instances of their parent class, allowing one interface for many implementations.

- **Compile-time (Method Overloading):** Same method name, different parameters.
- **Runtime (Method Overriding):** Subclass provides specific implementation.

```java
Animal a = new Dog();
a.eat(); // Calls Dog's eat() if overridden
```

### 5. Encapsulation
**Encapsulation** is the bundling of data and methods that operate on that data, restricting direct access to some components.

- Use `private` for fields, and provide `public` getters/setters.

```java
class Student {
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
```

### 6. Abstraction
**Abstraction** hides complex implementation details and exposes only the necessary features.

- Use `abstract` classes and methods.
- Use interfaces for complete abstraction.

```java
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```

## Important OOP Terms

- **Constructor:** Special method to initialize objects.
- **Method Overloading:** Multiple methods with the same name but different parameters.
- **Method Overriding:** Subclass redefines a method from its superclass.
- **Interface:** Reference type with abstract methods, constants, default/static methods.
- **Abstract Class:** Cannot be instantiated, may contain abstract and concrete methods.
- **final keyword:** Used to prevent inheritance, method overriding, or modification of variables.

## Example: Putting It All Together

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
}

interface Honkable {
    void honk();
}

class Sedan extends Car implements Honkable {
    public void honk() {
        System.out.println("Sedan honking");
    }
}

final class ElectricCar extends Car {
    // Cannot be subclassed further
    void start() {
        System.out.println("Electric Car started silently");
    }
}

public class Main {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan();
        mySedan.start();
        mySedan.honk();

        ElectricCar tesla = new ElectricCar();
        tesla.start();
    }
}
```

## Exceptions in OOP

- **Inheritance Exception:** Cannot extend a `final` class.
- **Method Exception:** Cannot override a `final` method.
- **Access Exception:** Private members are not accessible outside the class.
- **Multiple Inheritance Exception:** Java does not support multiple inheritance with classes.

## Best Practices

- Use meaningful class and method names.
- Keep classes focused on a single responsibility.
- Use access modifiers (`private`, `protected`, `public`) appropriately.
- Favor composition over inheritance when possible.
- Document your code for clarity.
- Avoid deep inheritance hierarchies.
- Use interfaces for abstraction and flexibility.

## Resources for Further Learning

- [Java Documentation](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [OOP Principles](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- [Java Programming Tutorials](https://www.w3schools.com/java/)

---

This README is a complete guide for students starting OOP in Java. Practice by writing your own classes, experimenting with inheritance, encapsulation, polymorphism, and abstraction!