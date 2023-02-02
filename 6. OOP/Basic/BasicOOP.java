import java.net.PasswordAuthentication;

//objects: Entities in the real world
//Classes: group of these entities (blue print of an objects)

//In java convention classes name starts with capital letter and function name starts with small letters

public class BasicOOP {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // p1.color = "Yellow";
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    // Getters & Setters
    // Get: to return the value
    // Set: to modify the Value
    // this: this keyword is used to refer to the current object
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

}

class Student {
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
