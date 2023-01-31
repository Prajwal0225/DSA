import java.util.Scanner;

public class BasicOfString {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String args[]) {

        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //! String are IMMUTABLE ---> Not changeable

        // Scanner sc = new Scanner(System.in);
        // String name;

        // //? nextLine ----> Take hole line as input
        // //? next ---> Take only first word as input
        // name = sc.nextLine();
        // System.out.println(name);

        // todo --> String length: length()
        // String fullName = "Prajwal Somalkar";
        // System.out.println(fullName.length());

        // // concatenation
        // String firstName = "Prajwal";
        // String lastName = "Somalkar";
        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName);

        // // charAt() Methode
        // System.out.println(fullName.charAt(1));

        // printLetters(fullName);

        // todo String Comparision
        String s1 = "Prajwal";
        String s2 = "Prajwal";
        String s3 = new String("Prajwal");

        if (s1 == s2) {
            System.out.println("String are epual");
        } else {
            System.out.println("String are not equal");
        }
        // "==" to check wheather two string are same at objcet level
        if (s1 == s3) {
            System.out.println("String are epual");
        } else {
            System.out.println("String are not equal");
        }

        // epuals checks only value of strings (interning concept)
        if (s1.equals(s3)) {
            System.out.println("String are epual");
        } else {
            System.out.println("String are not equal");
        }

    }
}
