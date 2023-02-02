public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        // Student s2 = new Student("Prajwal");
        // Student s3 = new Student(123);
        // Student s4 = new Student("Aman", 635);

        s1.name = "Prajwal";
        s1.roll = 61;
        s1.marks[0] = 100;
        s1.marks[1] = 97;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.marks[2] = 10;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    // Constuctor Overloading -> Polymorphism
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called ...");
    }

    Student(String name) {
        marks = new int[3];
        // System.out.println();
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        // System.out.println();
        this.roll = roll;
    }

    // Copy Constructor
    // Shallow Copy constructor -> Only refernce get copied
    /*
     * Student(Student s1) {
     * marks = new int[3];
     * this.name = s1.name;
     * this.roll = s1.roll;
     * this.marks = s1.marks;
     * }
     */

    // Deep Copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}
