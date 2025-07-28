// Parent class
class Animal {
    String name = "Generic Animal";

    // Constructor
    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    // Constructor
    Dog() {
        super(); // Calls Animal() constructor
        System.out.println("Dog constructor called");
    }

    void printNames() {
        System.out.println("Child class name: " + name);         // Dog
        System.out.println("Parent class name: " + super.name);  // Generic Animal
    }

    void sound() {
        System.out.println("Dog barks");
        super.sound();  // Calls parent class method
    }
}

// Main class
public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printNames();
        dog.sound();
    }
}
