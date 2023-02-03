//Interface is a blueprint of a class
//Multiple Inheritance is done my Interfaces in java

//Properties of Interfaces

//1. All methods are public, abstract & without implementation
//2. Used to achieve total abstraction
//3. Variables in the interface are final, publiec and static

public class Interfaces {

}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.prinln("up, down, left, right, diagonal (in all 4 dirns)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.prinln("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.prinln("up, down, left, right, diagonal (in all 4 dirns) -> Only one step at a time");
    }
}

// Multiple inheritance

interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {

}
