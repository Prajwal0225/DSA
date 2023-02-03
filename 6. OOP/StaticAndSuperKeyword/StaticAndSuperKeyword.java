//Static keyword in java is used to share the same variable or method of a given class

//We can use static keyword to
//1. Properties
//2. Functions
//3. Block
//4. Bested Classes

public class StaticAndSuperKeyword {
    public static void main(String args[]) {
        // static
        Student s1 = new Student();
        s1.schoolName = "GECA";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "JNUPS";

        System.out.println(s1.schoolName);

        // Super
        Horse h = new Horse();
    }
}

class Student {
    String name;
    int roll;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }
}

// Supper keyword

/*
 * Super keyword is used to refer immediate parent class object
 * 
 * - to access parent's properties
 * - to access parent's functions
 * - to access parent's constructor
 * 
 */

class Animal {
    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        System.out.println("Horse constructor is called");
    }
}