//Abstraction: Hidding all the unnecessay details and showing only the impportant parts to the user.

//Abstraction can be implemente by Abstract Classes OR Interfaces

//Properties
/*
 * Cannot create an instance (object) of abstract class
 * Can have abstract/non-abstract methods
 * Can have constructors
 */
public class Abstraction {
    public static void main(String args[]) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang M = new Mustang();

    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal Constructor get called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor get called");
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken Constructor get called");
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor get called");
    }
}