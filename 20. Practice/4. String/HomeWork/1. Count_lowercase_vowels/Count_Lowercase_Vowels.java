import java.util.Scanner;

//Question 1 : Count how many times lowercase volwels occurred in  a Strig entered by the user. 

//Vowels :  a, e, i, o, u

public class Count_Lowercase_Vowels {
    public static int count_vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(count_vowels(str));

        String str2 = "ApnaCollege".replace("A", "L");
        System.out.println(str2);
    }
}

// Question 2 :
// Output: false true