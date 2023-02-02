// Inheritance is when properties and methods of base class are passed on to a derived class.

public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
/*
 * // Base Class
 * class Animal {
 * String color;
 * 
 * void eat() {
 * System.out.println("eats");
 * }
 * 
 * void breathe() {
 * System.out.println("breathes");
 * }
 * }
 * 
 * // Derived Class
 * // Single level Inheritance
 * class Fish extends Animal {
 * int fins;
 * 
 * void swim() {
 * System.out.println("swims in ater");
 * }
 * 
 * }
 * 
 * // Multilevel Inheritance
 * class Mammal extends Animal {
 * int legs;
 * }
 * 
 * class Dog extends Mammal {
 * String breed;
 * }
 */

// hierarchical Inheritance

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void walk() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void walk() {
        System.out.println("fly");
    }
}