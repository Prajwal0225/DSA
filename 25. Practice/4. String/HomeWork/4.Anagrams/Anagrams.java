//Anagrams : IF two strings contain the same characters but in a different order , they can be said to be angrams.
//Consider race and care. In this case ,race's characters can be formed into a study, or cares's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.

import java.util.*;

public class Anagrams {
    public static boolean isAnagram(String str1, String str2) {

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        str1 = new String(char1);
        str2 = new String(char2);

        return str1.equals(str2);
    }

    public static void main(String args[]) {
        String str1 = "angel";
        String str2 = "glean";
        System.out.println(isAnagram(str1, str2));

    }

}
