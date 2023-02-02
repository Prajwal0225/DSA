//Polymorphism
//Compile Time Polymorphism -> Methode Overloading (static)
//Run TIme Polymorphism -> Method Overriding (dynamic)
public class Polymorphism {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.5, (float) 2.5));
        System.out.println(calc.sum(1, 2, 3));

        Deer D = new Deer();
        D.eat();
    }
}

// Methode Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}

// Method Overrriding -> Run time poly
// Parent nd child classes both contain the same function with a different
// definition.

class Animal {
    void eat() {
        System.out.println("eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eat grass");
    }
}
