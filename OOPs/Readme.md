# Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data and code: data in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods).

## Key Concepts of OOP

### 1. Class
A class is a blueprint or template for creating objects. It defines the properties and behaviors (fields and methods) that the created objects will have.

```java
class Animal {
    String name;
    void eat() {
        System.out.println(name + " is eating.");
    }
}
```

### 2. Object
An object is an instance of a class. It represents a real-world entity.

```java
Animal dog = new Animal();
dog.name = "Dog";
dog.eat();
```

### 3. Inheritance
Inheritance allows a class to inherit properties and methods from another class. This promotes code reusability.

```java
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}
```

### 4. Polymorphism
Polymorphism allows objects to be treated as instances of their parent class rather than their actual class. It enables one interface to be used for a general class of actions.

```java
Animal a = new Dog();
a.eat(); // Calls Dog's eat() if overridden
```

### 5. Encapsulation
Encapsulation is the wrapping of data (variables) and code (methods) together as a single unit. It restricts direct access to some of the object's components.

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
Abstraction is the concept of hiding the complex implementation details and showing only the necessary features of an object.

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

## Advantages of OOP

- **Modularity:** Code is organized into classes, making it easier to manage.
- **Reusability:** Classes can be reused in different programs.
- **Scalability:** Easy to add new features and maintain code.
- **Security:** Encapsulation provides data hiding.
- **Flexibility:** Polymorphism and inheritance allow flexible code.

## Important OOP Terms

- **Constructor:** Special method used to initialize objects.
- **Method Overloading:** Multiple methods with the same name but different parameters.
- **Method Overriding:** Subclass provides a specific implementation of a method already defined in its superclass.
- **Interface:** A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
- **Abstract Class:** A class that cannot be instantiated and may contain abstract methods.

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

public class Main {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan();
        mySedan.start();
        mySedan.honk();
    }
}
```

## Best Practices

- Use meaningful class and method names.
- Keep classes focused on a single responsibility.
- Use access modifiers (`private`, `protected`, `public`) appropriately.
- Favor composition over inheritance when possible.
- Document your code for clarity.

## Resources for Further Learning

- [Java Documentation](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [OOP Principles](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- [Java Programming Tutorials](https://www.w3schools.com/java/)

---

This README provides a comprehensive overview of OOP in Java for engineering students. Practice by writing your own classes and experimenting with these concepts!